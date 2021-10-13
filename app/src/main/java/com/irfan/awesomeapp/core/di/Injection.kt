package com.irfan.awesomeapp.core.di

import android.content.Context
import com.irfan.awesomeapp.core.data.AwesomeRepository
import com.irfan.awesomeapp.core.data.source.local.LocalDataSource
import com.irfan.awesomeapp.core.data.source.local.room.AppDatabase
import com.irfan.awesomeapp.core.data.source.remote.RemoteDataSource
import com.irfan.awesomeapp.core.data.source.remote.network.ApiConfig
import com.irfan.awesomeapp.core.domain.usecase.AwesomeInteractor
import com.irfan.awesomeapp.core.domain.usecase.AwesomeUseCase
import com.irfan.awesomeapp.core.utils.AppExecutors
import com.irfan.awesomeapp.core.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AwesomeRepository {
        val database = AppDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(ApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.photoDao())
        val appExecutors = AppExecutors()

        return AwesomeRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideAwesomeUseCase(context: Context): AwesomeUseCase {
        val repository = provideRepository(context)
        return AwesomeInteractor(repository)
    }
}