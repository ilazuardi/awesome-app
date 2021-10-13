package com.irfan.awesomeapp.core.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.irfan.awesomeapp.R
import com.irfan.awesomeapp.core.data.source.local.entity.PhotoEntity
import com.irfan.awesomeapp.core.domain.model.Photo
import com.irfan.awesomeapp.databinding.ItemGridBinding
import com.irfan.awesomeapp.databinding.ItemListBinding

class PhotoListAdapter(layoutManager: GridLayoutManager): RecyclerView.Adapter<PhotoListAdapter.ViewHolder>() {

    var gridLayoutManager: GridLayoutManager = layoutManager

    companion object {
        const val SPAN_COUNT_ONE = 1
        const val SPAN_COUNT_TWO = 2

        const val VIEW_TYPE_GRID = 1
        const val VIEW_TYPE_LIST = 2
    }

    private var listPhoto = ArrayList<Photo>()
    var onItemClick: ((Photo) -> Unit)? = null

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newListPhoto: List<Photo>?) {
        if (newListPhoto == null)
            return
        listPhoto.clear()
        listPhoto.addAll(newListPhoto)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        val spanCount: Int = gridLayoutManager.spanCount
        if (spanCount == SPAN_COUNT_ONE) {
            return VIEW_TYPE_LIST
        } else {
            return VIEW_TYPE_GRID
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder{
        val view: View
        if (viewType == VIEW_TYPE_LIST) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        } else {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_grid, parent, false)
        }
        return ViewHolder(view, viewType)
    }

    override fun onBindViewHolder(holder: PhotoListAdapter.ViewHolder, position: Int) {
        val photo = listPhoto[position]
        holder.bind(photo)
    }

    override fun getItemCount(): Int = listPhoto.size

    inner class ViewHolder(itemView: View, private var viewType: Int): RecyclerView.ViewHolder(itemView) {

        fun bind(photo: Photo) {
            if (viewType == VIEW_TYPE_LIST) {
                val bindingList = ItemListBinding.bind(itemView)
                with(bindingList) {
                    Glide.with(itemView.context)
                        .load(photo.tinyUrl)
                        .into(itemListPhotoIv)
                    itemListPhotographerTv.text = photo.photographer
                    itemListWidthTv.text = photo.width.toString()
                    itemListHeightTv.text = photo.height.toString()
                    root.setOnClickListener {
                        onItemClick?.invoke(listPhoto[adapterPosition])
                    }
                }
            } else {
                val bindingGrid = ItemGridBinding.bind(itemView)
                with(bindingGrid) {
                    Glide.with(itemView.context)
                        .load(photo.portraitUrl)
                        .into(itemGridPhotoIv)
                    itemGridPhotographerTv.text = photo.photographer
                    itemGridHeightTv.text = photo.height.toString()
                    itemGridWidthTv.text = photo.width.toString()
                    root.setOnClickListener {
                        onItemClick?.invoke(listPhoto[adapterPosition])
                    }
                }
            }
        }
    }

    override fun setHasStableIds(hasStableIds: Boolean) {
        super.setHasStableIds(true)
    }
}