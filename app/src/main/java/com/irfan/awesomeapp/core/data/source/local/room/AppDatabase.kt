package com.irfan.awesomeapp.core.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity


@Database(entities = [
    PhotoEntity::class
], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun photoDao(): PhotoDao
}