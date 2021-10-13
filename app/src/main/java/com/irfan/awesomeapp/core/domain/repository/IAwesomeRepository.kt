package com.irfan.awesomeapp.core.domain.repository

import androidx.lifecycle.LiveData
import com.irfan.awesomeapp.core.data.Resource
import com.irfan.awesomeapp.core.domain.model.Photo
import kotlinx.coroutines.flow.Flow

interface IAwesomeRepository {

    fun getAllPhoto(): Flow<Resource<List<Photo>>>

}