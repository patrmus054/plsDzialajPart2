package com.example.mehhhh.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mehhhh.Repository
import com.example.mehhhh.local.LocalDataSource
import com.example.mehhhh.remote.RemoteDataSource
import com.example.mehhhh.remote.Result

class SearchViewModel : ViewModel() {

    companion object{
        var isInternet: Boolean = true
    }

    var item: List<Result>? = null

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val text: LiveData<String> = _text

    fun getData(): Repository = if (isInternet) Repository(RemoteDataSource()) else Repository(
        LocalDataSource()
    )
}