package com.irfan.awesomeapp.core.utils

import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity
import com.irfan.awesomeapp.core.data.source.remote.response.PhotosItem
import com.irfan.awesomeapp.core.domain.model.Photo

object DataMapper {
    fun mapResponsesToEntities(input: List<PhotosItem?>?): List<PhotoEntity> {
        val photoList = ArrayList<PhotoEntity>()
        input?.map {
            val photo = PhotoEntity(
                it?.id!!,
                it.width!!,
                it.height!!,
                it.photographer!!,
                it.photographerUrl!!,
                it.avgColor!!,
                it.url!!,
                it.src!!.tiny!!,
                it.src.portrait!!,
                it.src.landscape!!
            )
            photoList.add(photo)
        }
        return photoList
    }

    fun mapEntitiesToDomain(input: List<PhotoEntity>): List<Photo> =
        input.map {
            Photo(
                it.photoId,
                it.width,
                it.height,
                it.photographer,
                it.photographerUrl,
                it.avgColor,
                it.url,
                it.tinyUrl,
                it.portraitUrl,
                it.landscapeUrl
            )
        }

    fun mapDomainToEntity(input: Photo) =
        PhotoEntity(
            input.photoId,
            input.width,
            input.height,
            input.photographer,
            input.photographerUrl,
            input.avgColor,
            input.url,
            input.tinyUrl,
            input.portraitUrl,
            input.landscapeUrl
        )

}