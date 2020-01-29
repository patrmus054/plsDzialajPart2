package com.example.mehhhh.ui.search

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mehhhh.Model
import com.example.mehhhh.R
import com.example.mehhhh.remote.MealService
import com.example.mehhhh.remote.Result
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {

    companion object{
        fun newInstance(): SearchFragment = SearchFragment()
    }

    lateinit var listAdapter: com.example.mehhhh.ui.search.ListAdapter

    var mMealList: List<Result>? = null
    private lateinit var searchViewModel: SearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
//
//        var posilek1 = Result()
//
//        posilek1.name="zupa"
//        posilek1.href="www.cos.com"
//        posilek1.ingredients="woda,maslo"
//        posilek1.thumbnail="zupa.jpg"
//
//        var posilek2 = Result()
//        posilek2.name="zupa"
//        posilek2.href="www.cos.com"
//        posilek2.ingredients="woda,maslo"
//        posilek2.thumbnail="zupa.jpg"
//
//        var posilek3 = Result()
//        posilek3.name="zupa"
//        posilek3.href="www.cos.com"
//        posilek3.ingredients="woda,maslo"
//        posilek3.thumbnail="zupa.jpg"
//
//        var posilek4 = Result()
//        posilek4.name="zupa"
//        posilek4.href="www.cos.com"
//        posilek4.ingredients="woda,maslo"
//        posilek4.thumbnail="zupa.jpg"
//
//         mMealList = listOf(posilek1, posilek2, posilek3, posilek4 )
    }


    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?):
            View? {searchViewModel = ViewModelProviders.of(this).get(SearchViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_search, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mMealList = mutableListOf()
        listAdapter = ListAdapter(mMealList as MutableList<Result>)
        list_recycler_view.apply {



            layoutManager = LinearLayoutManager(activity)
            adapter = listAdapter
        }
        searchViewModel.item.observe(this, Observer {
            Log.e("myapp","Working...")
            listAdapter.setList(it)
        })
        searchViewModel.getAllMeals()
//        searchViewModel.getAllMeals()
//        list_recycler_view.apply {
//            mMealList = searchViewModel.getData().getAllMeals()
//            layoutManager = LinearLayoutManager(activity)
//            adapter = mMealList?.let { ListAdapter(it) }
//        }
    }



}
