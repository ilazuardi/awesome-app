package com.irfan.awesomeapp.core.data.source.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "photo")
data class PhotoEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "photoId")
    val photoId: Int,

    @ColumnInfo(name = "width")
    val width: Int,

    @ColumnInfo(name = "height")
    val height: Int,

    @ColumnInfo(name = "photographer")
    val photographer: String,

    @ColumnInfo(name = "photographerUrl")
    val photographerUrl: String,

    @ColumnInfo(name = "avgColor")
    val avgColor: String,

    @ColumnInfo(name = "url")
    val url: String,

    @ColumnInfo(name = "tinyUrl")
    val tinyUrl: String,

    @ColumnInfo(name = "portraitUrl")
    val portraitUrl: String,

    @ColumnInfo(name = "landscapeUrl")
    val landscapeUrl: String
) : Parcelable
