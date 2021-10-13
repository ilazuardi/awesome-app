package com.irfan.awesomeapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.irfan.awesomeapp.core.domain.usecase.AwesomeUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(awesomeUseCase: AwesomeUseCase): ViewModel() {
    val photo = awesomeUseCase.getAllPhoto().asLiveData()
}