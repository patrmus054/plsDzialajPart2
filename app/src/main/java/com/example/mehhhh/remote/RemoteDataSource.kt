package com.example.mehhhh.remote

import android.util.Log
import com.example.mehhhh.DataSource
import com.example.mehhhh.Repository
import com.example.mehhhh.ui.search.SearchViewModel
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDataSource: DataSource {

    companion object{
        val BaseUrl = "http://www.recipepuppy.com/"
        var page = 1
    }

    override suspend fun getAllMeals(): List<Result> = getData("","", page)

    override suspend fun getMealsByName(name: String): List<Result> = getData("", name, page)

    override suspend fun getMealsByIngredient(ingredient: String): List<Result> = getData(ingredient, "", page)

    override suspend fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result> = getData(ingredient,name,page)

    override suspend fun refreshNews(){ getAllMeals() }

    internal suspend fun getData(ingredient: String, meal: String, page: Int) : List<Result>{

        var mealsData: MealResponse? = null

        val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(MealService::class.java)
        val call = service.getCurrentMealData("","", Companion.page)

        var result = call.await()
        return result.results
 }
}