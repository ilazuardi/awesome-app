package com.irfan.awesomeapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.irfan.awesomeapp.core.data.Resource
import com.irfan.awesomeapp.core.domain.model.Photo
import com.irfan.awesomeapp.core.domain.repository.IAwesomeRepository

class AwesomeInteractor(private val awesomeRepository: IAwesomeRepository): AwesomeUseCase {

    override fun getAllPhoto() = awesomeRepository.getAllPhoto()

}