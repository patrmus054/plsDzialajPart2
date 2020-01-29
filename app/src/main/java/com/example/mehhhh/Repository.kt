package com.example.mehhhh

import com.example.mehhhh.remote.Result

class Repository(private val dataSource: DataSource): DataSource{

    override suspend fun getAllMeals(): List<Result> = dataSource.getAllMeals()

    override suspend fun getMealsByName(name: String): List<Result> = dataSource.getMealsByName(name)

    override suspend fun getMealsByIngredient(ingredient: String): List<Result> = dataSource.getMealsByIngredient(ingredient)

    override suspend fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result> = dataSource.getMealsByIngredientAndName(name, ingredient)

    override suspend fun refreshNews() = dataSource.refreshNews()
}