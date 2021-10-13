package com.irfan.awesomeapp.core.data.source.local

import androidx.lifecycle.LiveData
import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity
import com.irfan.awesomeapp.core.data.source.local.room.PhotoDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalDataSource @Inject constructor(private val photoDao: PhotoDao) {

    fun getAllPhoto(): Flow<List<PhotoEntity>> = photoDao.getAllPhoto()

    suspend fun insertPhoto(photoList: List<PhotoEntity>) = photoDao.insertPhoto(photoList)
}