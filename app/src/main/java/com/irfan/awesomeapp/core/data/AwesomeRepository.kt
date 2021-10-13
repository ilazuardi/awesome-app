package com.irfan.awesomeapp.core.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.irfan.awesomeapp.core.data.source.local.LocalDataSource
import com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource
import com.irfan.awesomeapp.core.data.source.remote.network.ApiResponse
import com.irfan.awesomeapp.core.data.source.remote.response.PhotosItem
import com.irfan.awesomeapp.core.domain.model.Photo
import com.irfan.awesomeapp.core.domain.repository.IAwesomeRepository
import com.irfan.awesomeapp.core.utils.AppExecutors
import com.irfan.awesomeapp.core.utils.DataMapper

class AwesomeRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : IAwesomeRepository {

    companion object {
        @Volatile
        private var instance: AwesomeRepository? = null

        fun getInstance(
            remoteData: RemoteDataSource,
            localData: LocalDataSource,
            appExecutors: AppExecutors
        ): AwesomeRepository =
            instance ?: synchronized(this) {
                instance ?: AwesomeRepository(remoteData, localData, appExecutors)
            }
    }

    override fun getAllPhoto(): LiveData<Resource<List<Photo>>> =
        object : NetworkBoundResource<List<Photo>, List<PhotosItem>>(appExecutors) {
            override fun loadFromDB(): LiveData<List<Photo>> {
                return Transformations.map(localDataSource.getAllPhoto()) {
                    DataMapper.mapEntitiesToDomain(it)
                }
            }

            override fun shouldFetch(data: List<Photo>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<PhotosItem?>?>> =
                remoteDataSource.getAllPhoto()

            override fun saveCallResult(data: List<PhotosItem?>?) {
                val photoList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertPhoto(photoList)
            }
        }.asLiveData()
}