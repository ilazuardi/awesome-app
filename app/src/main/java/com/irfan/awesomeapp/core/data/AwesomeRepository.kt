package com.irfan.awesomeapp.core.data

import com.irfan.awesomeapp.core.data.source.local.LocalDataSource
import com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource
import com.irfan.awesomeapp.core.data.source.remote.network.ApiResponse
import com.irfan.awesomeapp.core.data.source.remote.response.PhotosItem
import com.irfan.awesomeapp.core.domain.model.Photo
import com.irfan.awesomeapp.core.domain.repository.IAwesomeRepository
import com.irfan.awesomeapp.core.utils.AppExecutors
import com.irfan.awesomeapp.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AwesomeRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : IAwesomeRepository {

    override fun getAllPhoto(): Flow<Resource<List<Photo>>> =
        object : NetworkBoundResource<List<Photo>, List<PhotosItem>>() {
            override fun loadFromDB(): Flow<List<Photo>> = localDataSource.getAllPhoto().map{DataMapper.mapEntitiesToDomain(it)}

            override fun shouldFetch(data: List<Photo>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<PhotosItem?>?>> =
                remoteDataSource.getAllPhoto()

            override suspend fun saveCallResult(data: List<PhotosItem?>?) {
                val photoList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertPhoto(photoList)
            }
        }.asFlow()
}