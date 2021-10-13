package com.irfan.awesomeapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.irfan.awesomeapp.core.data.Resource
import com.irfan.awesomeapp.core.domain.model.Photo
import kotlinx.coroutines.flow.Flow

interface AwesomeUseCase {

    fun getAllPhoto(): Flow<Resource<List<Photo>>>
}