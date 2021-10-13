package com.irfan.awesomeapp.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.irfan.awesomeapp.R
import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity
import com.irfan.awesomeapp.core.domain.model.Photo
import com.irfan.awesomeapp.databinding.ActivityDetailPhotoBinding
import kotlinx.android.synthetic.main.activity_detail_photo.*

class DetailPhotoActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ActivityDetailPhotoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPhotoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val detailPhoto = intent.getParcelableExtra<Photo>(EXTRA_DATA)
        showDetailPhoto(detailPhoto)
    }

    private fun showDetailPhoto(detailPhoto: Photo?) {
        detailPhoto?.let {
            supportActionBar?.title = "Detail Photo"
            binding.content.photographerDetailTv.text = detailPhoto.photographer
            binding.content.urlPhotographerDetailTv.text = detailPhoto.photographerUrl
            Glide.with(this@DetailPhotoActivity)
                .load(detailPhoto.landscapeUrl)
                .fitCenter()
                .into(binding.ivDetailImage)
        }
    }
}