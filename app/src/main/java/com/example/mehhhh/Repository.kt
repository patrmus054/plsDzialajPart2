package com.example.mehhhh

import com.example.mehhhh.remote.Result
import com.example.mehhhh.remote.TMDBCategoriesRespond
import com.example.mehhhh.remote.TMDBResponse

class Repository(private val dataSource: DataSource): DataSource{

    override suspend fun getAllMeals(): List<Result> = dataSource.getAllMeals()

    override suspend fun getMealsByName(name: String): List<Result> = dataSource.getMealsByName(name)

    override suspend fun getMealsByIngredient(ingredient: String): List<Result> = dataSource.getMealsByIngredient(ingredient)

    override suspend fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result> = dataSource.getMealsByIngredientAndName(name, ingredient)

    override suspend fun refreshNews() = dataSource.refreshNews()
    override suspend fun getTMDBMealByName(name: String): List<TMDBResponse> = dataSource.getTMDBMealByName(name)

    override suspend fun getFullTMDBMealDetailsById(id: String): List<TMDBResponse>  = dataSource.getFullTMDBMealDetailsById(id)

    override suspend fun getSingleTMDBMeal(): List<TMDBResponse> = dataSource.getSingleTMDBMeal()

    override suspend fun getAllTMDBMealCategories(): List<TMDBCategoriesRespond> = dataSource.getAllTMDBMealCategories()

    override suspend fun getListOfCategories(category: String): List<TMDBResponse> = dataSource.getListOfCategories(category)

    override suspend fun getListOfArea(area: String): List<TMDBResponse> = dataSource.getListOfArea(area)

    override suspend fun getListOfIngedients(area: String): List<TMDBResponse> = getListOfIngedients(area)

    override suspend fun getTMDBMealsByCategory(category: String): List<TMDBResponse> = getTMDBMealsByCategory(category)

    override suspend fun getTMDBMealsByArea(area: String): List<TMDBResponse> = dataSource.getTMDBMealsByArea(area)
}