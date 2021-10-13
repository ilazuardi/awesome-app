package com.irfan.awesomeapp.core.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity

@Dao
interface PhotoDao {

    @Query("SELECT * FROM photo")
    fun getAllPhoto() : LiveData<List<PhotoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPhoto(photos: List<PhotoEntity>)
}