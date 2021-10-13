package com.irfan.awesomeapp.core.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface PhotoDao {

    @Query("SELECT * FROM photo")
    fun getAllPhoto() : Flow<List<PhotoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPhoto(photos: List<PhotoEntity>)
}