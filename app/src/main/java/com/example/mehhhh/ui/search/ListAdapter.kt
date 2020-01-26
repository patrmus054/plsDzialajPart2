package com.example.mehhhh.ui.search

import android.view.Display
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mehhhh.Model
import com.example.mehhhh.R
import com.example.mehhhh.remote.Result

class ListAdapter(private val list: List<Result>)
    : RecyclerView.Adapter<SearchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return SearchViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val meal: Result = list[position]
        holder.bind(meal)
    }

    override fun getItemCount(): Int = list.size

}

class SearchViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.search_item, parent, false)) {
    private var mTitleView: TextView? = null
    private var mIngredientView: TextView? = null


    init {
        mTitleView = itemView.findViewById(R.id.tv_search_title)
        mIngredientView = itemView.findViewById(R.id.tv_search_not_possessed_ingredients)
    }

    fun bind(meal: Result) {
        mTitleView?.text = meal.name
        mIngredientView?.text = meal.ingredients
    }

}