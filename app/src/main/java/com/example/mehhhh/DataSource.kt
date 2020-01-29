package com.example.mehhhh

import com.example.mehhhh.remote.Result

interface DataSource {

    suspend fun getAllMeals(): List<Result>
    suspend fun getMealsByName(name: String): List<Result>
    suspend fun getMealsByIngredient(ingredient: String): List<Result>
    suspend fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result>
    suspend fun refreshNews()

}