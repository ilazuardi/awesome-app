package com.irfan.awesomeapp.core.data.source.remote.response

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class PhotoResponse(
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
)