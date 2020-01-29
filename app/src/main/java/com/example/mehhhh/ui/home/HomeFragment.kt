package com.example.mehhhh.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mehhhh.R
import com.example.mehhhh.remote.Result
import com.example.mehhhh.remote.TMDBResult
import com.example.mehhhh.ui.search.ListAdapter
import com.example.mehhhh.ui.search.ListAdapterV2
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_search.*


class HomeFragment : Fragment() {

    companion object{
        fun newInstance(): HomeFragment = HomeFragment()
    }

    lateinit var listAdapter: com.example.mehhhh.ui.search.ListAdapter
    var mMealList: List<Result>? = null
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        mMealList = mutableListOf()
        listAdapter = ListAdapter(mMealList as MutableList<TMDBResult>)
        home_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = listAdapter
        }
        homeViewModel.item.observe(this, Observer {
            listAdapter.setList(it)
        })
        homeViewModel.getAllMeals()
    }

}