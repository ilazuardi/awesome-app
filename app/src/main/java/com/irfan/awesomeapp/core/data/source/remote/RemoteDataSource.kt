package com.irfan.awesomeapp.core.data.source.remote

import android.util.Log
import com.irfan.awesomeapp.core.data.source.remote.network.ApiResponse
import com.irfan.awesomeapp.core.data.source.remote.network.ApiService
import com.irfan.awesomeapp.core.data.source.remote.response.PhotosItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSource @Inject constructor(private val apiService: ApiService) {

    fun getAllPhoto(): Flow<ApiResponse<List<PhotosItem?>?>> {

        return flow {
            try {
                val response = apiService.getListPhoto(tokenApi)
                val dataArray = response.photos
                if (dataArray!!.isNotEmpty()) {
                    emit(ApiResponse.Success(response.photos))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    companion object {
        const val tokenApi = "563492ad6f91700001000001f010d7b7b3454a949a7dc0d6f811e03f"
    }
}