package com.example.mehhhh.local

import com.example.mehhhh.DataSource
import com.example.mehhhh.remote.Result

class LocalDataSource: DataSource {
    override suspend  fun getAllMeals(): List<Result> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getMealsByName(name: String): List<Result> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getMealsByIngredient(ingredient: String): List<Result> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun refreshNews() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}