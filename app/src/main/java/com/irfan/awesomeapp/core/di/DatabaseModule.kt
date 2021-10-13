package com.irfan.awesomeapp.core.di

import android.content.Context
import androidx.room.Room
import com.irfan.awesomeapp.core.data.source.local.room.AppDatabase
import com.irfan.awesomeapp.core.data.source.local.room.PhotoDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(context: Context): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "App.db"
    ).fallbackToDestructiveMigration().build()

    @Provides
    fun providePhotoDao(database: AppDatabase): PhotoDao = database.photoDao()
}