package com.irfan.awesomeapp.di

import com.irfan.awesomeapp.core.domain.usecase.AwesomeInteractor
import com.irfan.awesomeapp.core.domain.usecase.AwesomeUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun provideAwesomeUseCase(awesomeInteractor: AwesomeInteractor): AwesomeUseCase
}