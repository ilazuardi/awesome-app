package com.irfan.awesomeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Adapter
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.irfan.awesomeapp.core.data.Resource
import com.irfan.awesomeapp.core.ui.PhotoListAdapter
import com.irfan.awesomeapp.core.ui.PhotoListAdapter.Companion.SPAN_COUNT_ONE
import com.irfan.awesomeapp.core.ui.PhotoListAdapter.Companion.SPAN_COUNT_TWO
import com.irfan.awesomeapp.core.ui.ViewModelFactory
import com.irfan.awesomeapp.databinding.ActivityMainBinding
import com.irfan.awesomeapp.detail.DetailPhotoActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var photoAdapter: PhotoListAdapter

    @Inject
    lateinit var factory: ViewModelFactory

    private val mainViewModel: MainViewModel by viewModels {
        factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        gridLayoutManager = GridLayoutManager(this, SPAN_COUNT_ONE)
        photoAdapter = PhotoListAdapter(gridLayoutManager)

        photoAdapter.onItemClick = { selectedData ->
            val intent = Intent(this@MainActivity, DetailPhotoActivity::class.java)
            intent.putExtra(DetailPhotoActivity.EXTRA_DATA, selectedData)
            startActivity(intent)
        }

        mainViewModel.photo.observe(this@MainActivity, {
            if (it != null) {
                when (it) {
                    is Resource.Loading -> binding.loadingPb.visibility = View.VISIBLE
                    is Resource.Success -> {
                        binding.loadingPb.visibility = View.GONE
                        photoAdapter.setData(it.data)
                    }
                    is Resource.Error -> {
                        binding.loadingPb.visibility = View.GONE
                        binding.errorMessageTv.visibility = View.VISIBLE
                        binding.errorMessageTv.text = it.message ?: getString(R.string.something_wrong)
                    }
                }
            }
        })

        with(binding.photoRv) {
            layoutManager = gridLayoutManager
            setHasFixedSize(true)
            adapter = photoAdapter
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_switch_layout) {
            switchLayout()
            switchIcon(item)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun switchLayout() {
        if (gridLayoutManager.spanCount == SPAN_COUNT_ONE) {
            gridLayoutManager.spanCount = SPAN_COUNT_TWO
        } else {
            gridLayoutManager.spanCount = SPAN_COUNT_ONE
        }
        photoAdapter.notifyItemRangeChanged(0, photoAdapter.itemCount)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun switchIcon(item: MenuItem) {
        if (gridLayoutManager.spanCount == SPAN_COUNT_TWO) {
            item.setIcon(resources.getDrawable(R.drawable.ic_span_2))
        } else {
            item.setIcon(resources.getDrawable(R.drawable.ic_span_1))
        }
    }
}