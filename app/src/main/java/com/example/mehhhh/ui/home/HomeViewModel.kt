package com.example.mehhhh.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mehhhh.Repository
import com.example.mehhhh.local.LocalDataSource
import com.example.mehhhh.remote.RemoteDataSource
import com.example.mehhhh.remote.Result
import com.example.mehhhh.remote.TMDBResult
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    companion object{
        var isInternet: Boolean = true
    }

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(
        viewModelJob + Dispatchers.Main )


    private var _item: MutableLiveData<List<TMDBResult>> = MutableLiveData()

    val item: LiveData<List<TMDBResult>>
        get() = _item



    fun getAllMeals(){
        coroutineScope.launch {
            Log.e("myapp","weszlo")
            val result = getData().getSingleTMDBMeal()[0].meals
            Log.w("HomeViewModel", result[0].strMeal)
            _item.value = result
        }
    }


    fun getData(): Repository = if (isInternet) Repository( RemoteDataSource()) else Repository(  LocalDataSource()  )

}