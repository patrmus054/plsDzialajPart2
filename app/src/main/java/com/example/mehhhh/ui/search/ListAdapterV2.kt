package com.example.mehhhh.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mehhhh.R
import com.example.mehhhh.remote.Result
import com.example.mehhhh.remote.TMDBResult

class ListAdapterV2(private val list: MutableList<Result>)
    : RecyclerView.Adapter<BaseViewHolderV2>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolderV2 {
        val inflater = LayoutInflater.from(parent.context)
        return BaseViewHolderV2(inflater, parent)
    }

    override fun onBindViewHolder(holder: BaseViewHolderV2, position: Int) {
        val meal: Result = list[position]
        holder.bind(meal)
    }

    override fun getItemCount(): Int = list.size

    fun setList(newlist: List<Result>){
        list.clear()
        list.addAll(newlist)
        notifyDataSetChanged()
    }
}

class BaseViewHolderV2(inflater: LayoutInflater, parent: ViewGroup) :
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