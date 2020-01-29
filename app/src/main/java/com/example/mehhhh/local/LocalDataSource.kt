package com.example.mehhhh.local

import com.example.mehhhh.DataSource
import com.example.mehhhh.remote.Result
import com.example.mehhhh.remote.TMDBCategoriesRespond
import com.example.mehhhh.remote.TMDBResponse

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

    override suspend fun getTMDBMealByName(name: String): List<TMDBResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getFullTMDBMealDetailsById(id: String): List<TMDBResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getSingleTMDBMeal(): List<TMDBResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getAllTMDBMealCategories(): List<TMDBCategoriesRespond> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getListOfCategories(category: String): List<TMDBResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getListOfArea(area: String): List<TMDBResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getListOfIngedients(area: String): List<TMDBResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getTMDBMealsByCategory(category: String): List<TMDBResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getTMDBMealsByArea(area: String): List<TMDBResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}