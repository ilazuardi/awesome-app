package com.irfan.awesomeapp.core.domain.repository

import androidx.lifecycle.LiveData
import com.irfan.awesomeapp.core.data.Resource
import com.irfan.awesomeapp.core.domain.model.Photo

interface IAwesomeRepository {

    fun getAllPhoto(): LiveData<Resource<List<Photo>>>

}