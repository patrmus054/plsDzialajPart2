package com.example.mehhhh.local

import com.example.mehhhh.DataSource
import com.example.mehhhh.remote.Result

class LocalDataSource: DataSource {
    override fun getAllMeals(): List<Result> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMealsByName(name: String): List<Result> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMealsByIngredient(ingredient: String): List<Result> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun refreshNews() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}