package com.irfan.awesomeapp.core.data.source.local

import androidx.lifecycle.LiveData
import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity
import com.irfan.awesomeapp.core.data.source.local.room.PhotoDao

class LocalDataSource private constructor(private val photoDao: PhotoDao) {

    companion object {
        private var instance: LocalDataSource? = null

        fun getInstance(photoDao: PhotoDao) : LocalDataSource =
            instance ?: synchronized(this) {
                instance ?: LocalDataSource(photoDao)
            }
    }

    fun getAllPhoto(): LiveData<List<PhotoEntity>> = photoDao.getAllPhoto()

    fun insertPhoto(photoList: List<PhotoEntity>) = photoDao.insertPhoto(photoList)
}