package com.example.mehhhh.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealService {

    @GET("api/")
    fun getCurrentMealData(@Query("i") ingredient: String, @Query("q") meal: String, @Query("p") page: Int): Call<MealResponse>
}