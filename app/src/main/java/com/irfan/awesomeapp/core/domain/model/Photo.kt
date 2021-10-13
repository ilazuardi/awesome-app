package com.irfan.awesomeapp.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Photo(
    val photoId: Int,
    val width: Int,
    val height: Int,
    val photographer: String,
    val photographerUrl: String,
    val avgColor: String,
    val url: String,
    val tinyUrl: String,
    val portraitUrl: String,
    val landscapeUrl: String
) : Parcelable