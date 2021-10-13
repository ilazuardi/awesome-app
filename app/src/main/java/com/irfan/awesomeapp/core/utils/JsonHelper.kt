package com.irfan.awesomeapp.core.utils

import android.content.Context
import com.irfan.awesomeapp.R
import com.irfan.awesomeapp.core.data.source.remote.response.PhotoResponse
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {
    private fun parsingFileToString(): String? {
        val jsonString: String
        try {
            jsonString = context.resources.openRawResource(R.raw.awesome).bufferedReader()
                .use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

    fun loadData(): List<PhotoResponse> {
        val list = ArrayList<PhotoResponse>()
        val responseObject = JSONObject(parsingFileToString().toString())
        val listArray = responseObject.getJSONArray("photos")
        for (i in 0 until listArray.length()) {
            val photos = listArray.getJSONObject(i)
            val src = photos.getJSONObject("src")

            val photoResponse = PhotoResponse(
                photos.getInt("id"),
                photos.getInt("width"),
                photos.getInt("height"),
                photos.getString("photographer"),
                photos.getString("photographer_url"),
                photos.getString("avg_color"),
                photos.getString("url"),
                src.getString("tiny"),
                src.getString("portrait"),
                src.getString("landscape")
            )
            list.add(photoResponse)
        }
        return list
    }
}