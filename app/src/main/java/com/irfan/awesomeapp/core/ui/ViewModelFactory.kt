package com.irfan.awesomeapp.core.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.irfan.awesomeapp.MainViewModel
import com.irfan.awesomeapp.core.data.AwesomeRepository
import com.irfan.awesomeapp.core.di.Injection
import com.irfan.awesomeapp.core.domain.usecase.AwesomeUseCase

class ViewModelFactory private constructor(private val awesomeUseCase: AwesomeUseCase) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideAwesomeUseCase(context))
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> {
                MainViewModel(awesomeUseCase) as T
            }
            else -> throw Throwable("Uknown viewModel class: "+modelClass.name)
        }
}