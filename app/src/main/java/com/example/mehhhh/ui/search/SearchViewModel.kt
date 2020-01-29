package com.example.mehhhh.ui.search

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mehhhh.Repository
import com.example.mehhhh.local.LocalDataSource
import com.example.mehhhh.remote.RemoteDataSource
import com.example.mehhhh.remote.Result
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {


    companion object{
        var isInternet: Boolean = true
    }

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(
        viewModelJob + Dispatchers.Main )


    var _item: MutableLiveData<List<Result>>
    init {
        _item = MutableLiveData()
    }
    val item:LiveData<List<Result>>
        get() = _item



    fun getAllMeals(){
        coroutineScope.launch {
            Log.e("myapp","weszlo")
            val result = getData().getAllMeals()
            _item.value = result
        }
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    val text: LiveData<String> = _text

    fun getData(): Repository = if (isInternet) Repository(RemoteDataSource()) else Repository(
        LocalDataSource()
    )

}