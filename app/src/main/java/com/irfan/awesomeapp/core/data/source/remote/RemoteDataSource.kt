package com.irfan.awesomeapp.core.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.irfan.awesomeapp.core.data.source.remote.network.ApiResponse
import com.irfan.awesomeapp.core.data.source.remote.network.ApiService
import com.irfan.awesomeapp.core.data.source.remote.response.ListPhotoResponse
import com.irfan.awesomeapp.core.data.source.remote.response.PhotosItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RemoteDataSource private constructor(private val apiService: ApiService) {

    companion object {
        const val tokenApi = "563492ad6f91700001000001f010d7b7b3454a949a7dc0d6f811e03f"

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(service: ApiService): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(service)
            }
    }

    fun getAllPhoto(): LiveData<ApiResponse<List<PhotosItem?>?>> {
        val resultData = MutableLiveData<ApiResponse<List<PhotosItem?>?>>()

        val client = apiService.getListPhoto(Companion.tokenApi)

        client.enqueue(object : Callback<ListPhotoResponse> {
            override fun onResponse(
                call: Call<ListPhotoResponse>,
                response: Response<ListPhotoResponse>
            ) {
                val dataArray = response.body()?.photos
                resultData.value = if (dataArray != null) ApiResponse.Success(dataArray) else ApiResponse.Empty
            }

            override fun onFailure(call: Call<ListPhotoResponse>, t: Throwable) {
                resultData.value = ApiResponse.Error(t.message.toString())
                Log.e("RemoteDataSource", t.message.toString())
            }

        })

        return resultData
    }
}