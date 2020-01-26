package com.example.mehhhh.ui.recepies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mehhhh.R

class RecepiesFragment : Fragment() {

    private lateinit var recepiesViewModel: RecepiesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        recepiesViewModel =
            ViewModelProviders.of(this).get(RecepiesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_recipes, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        recepiesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}