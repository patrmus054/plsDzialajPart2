package com.example.mehhhh

import com.example.mehhhh.remote.Result

interface DataSource {

    fun getAllMeals(): List<Result>
    fun getMealsByName(name: String): List<Result>
    fun getMealsByIngredient(ingredient: String): List<Result>
    fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result>
    fun refreshNews()

}