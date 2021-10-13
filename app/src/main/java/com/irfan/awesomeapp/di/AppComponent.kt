package com.irfan.awesomeapp.di

import com.irfan.awesomeapp.MainActivity
import com.irfan.awesomeapp.core.di.CoreComponent
import com.irfan.awesomeapp.detail.DetailPhotoActivity
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class, ViewModelModule::class]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: DetailPhotoActivity)
}