package com.example.mehhhh.ui.ingredients

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mehhhh.R

class IngredientFragment : Fragment() {

    private lateinit var ingredientViewModel: IngredientViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        ingredientViewModel = ViewModelProviders.of(this).get(IngredientViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ingredients, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        ingredientViewModel.text.observe(this, Observer {textView.text = it })
        return root
    }
}