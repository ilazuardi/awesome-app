package com.irfan.awesomeapp.core.di

import com.irfan.awesomeapp.core.data.AwesomeRepository
import com.irfan.awesomeapp.core.domain.repository.IAwesomeRepository
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(awesomeRepository: AwesomeRepository): IAwesomeRepository

}