package com.example.mehhhh

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class ActivityUtils {

    companion object{
        fun addFragmentToActivity(
            manager: FragmentManager,
            fragment: Fragment?,
            frameId: Int
        ) {
            val transaction: FragmentTransaction = manager.beginTransaction()
            if (fragment != null) {
                transaction.add(frameId, fragment)
            }
            transaction.commit()
        }
    }

}