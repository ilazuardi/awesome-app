package com.irfan.awesomeapp.core.di

import android.content.Context
import com.irfan.awesomeapp.core.domain.repository.IAwesomeRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [RepositoryModule::class]
)
interface CoreComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }

    fun provideRepository(): IAwesomeRepository

}