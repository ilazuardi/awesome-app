package com.irfan.awesomeapp.core.data.source.remote.network

import com.irfan.awesomeapp.core.data.source.remote.response.ListPhotoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {

    @GET("curated")
    fun getListPhoto(@Header("Authorization") token: String): Call<ListPhotoResponse>

}