package com.irfan.awesomeapp

import androidx.lifecycle.ViewModel
import com.irfan.awesomeapp.core.data.AwesomeRepository
import com.irfan.awesomeapp.core.domain.usecase.AwesomeUseCase

class MainViewModel(awesomeUseCase: AwesomeUseCase): ViewModel() {
    val photo = awesomeUseCase.getAllPhoto()
}