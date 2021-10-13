package com.irfan.awesomeapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.irfan.awesomeapp.core.data.Resource
import com.irfan.awesomeapp.core.domain.model.Photo

interface AwesomeUseCase {

    fun getAllPhoto(): LiveData<Resource<List<Photo>>>
}