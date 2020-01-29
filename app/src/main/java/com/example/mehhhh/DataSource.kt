package com.example.mehhhh

import com.example.mehhhh.remote.Result
import com.example.mehhhh.remote.TMDBCategoriesRespond
import com.example.mehhhh.remote.TMDBResponse

interface DataSource {

    suspend fun getAllMeals(): List<Result>
    suspend fun getMealsByName(name: String): List<Result>
    suspend fun getMealsByIngredient(ingredient: String): List<Result>
    suspend fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result>
    suspend fun refreshNews()
    suspend fun getTMDBMealByName(name: String): List<TMDBResponse>

    suspend fun getFullTMDBMealDetailsById(id: String): List<TMDBResponse>

    suspend fun getSingleTMDBMeal(): List<TMDBResponse>

    suspend fun getAllTMDBMealCategories(): List<TMDBCategoriesRespond>

    suspend fun getListOfCategories(category: String): List<TMDBResponse>

    suspend fun getListOfArea(area: String): List<TMDBResponse>

    suspend fun getListOfIngedients(area: String): List<TMDBResponse>

    suspend fun getTMDBMealsByCategory(category: String): List<TMDBResponse>

    suspend fun getTMDBMealsByArea(area: String): List<TMDBResponse>


}