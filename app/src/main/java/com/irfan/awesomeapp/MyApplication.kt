package com.irfan.awesomeapp

import android.app.Application
import com.irfan.awesomeapp.core.di.CoreComponent
import com.irfan.awesomeapp.core.di.DaggerCoreComponent
import com.irfan.awesomeapp.di.AppComponent
import com.irfan.awesomeapp.di.DaggerAppComponent

open class MyApplication : Application() {
    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }
}