package com.example.mehhhh

import com.example.mehhhh.remote.Result

class Repository(private val dataSource: DataSource): DataSource{

    override fun getAllMeals(): List<Result> = dataSource.getAllMeals()

    override fun getMealsByName(name: String): List<Result> = dataSource.getMealsByName(name)

    override fun getMealsByIngredient(ingredient: String): List<Result> = dataSource.getMealsByIngredient(ingredient)

    override fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result> = dataSource.getMealsByIngredientAndName(name, ingredient)

    override fun refreshNews() = dataSource.refreshNews()
}