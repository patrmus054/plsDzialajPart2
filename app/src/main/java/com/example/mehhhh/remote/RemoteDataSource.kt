package com.example.mehhhh.remote

import android.util.Log
import com.example.mehhhh.DataSource
import com.example.mehhhh.Repository
import com.example.mehhhh.ui.search.SearchViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDataSource: DataSource {

    companion object{
        val BaseUrl = "http://www.recipepuppy.com/"
        var page = 1

    }
    override fun getAllMeals(): List<Result> = getData("","", page)

    override fun getMealsByName(name: String): List<Result> = getData("", name, page)

    override fun getMealsByIngredient(ingredient: String): List<Result> = getData(ingredient, "", page)

    override fun getMealsByIngredientAndName(name: String, ingredient: String): List<Result> = getData(ingredient,name,page)

    override fun refreshNews(){ getAllMeals() }

    internal fun getData(ingredient: String,meal: String, page: Int): List<Result>{

        var mealsData: MealResponse? = null

        val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(MealService::class.java)
        val call = service.getCurrentMealData("","", Companion.page)




        call.enqueue(object : Callback<MealResponse> {
            override fun onResponse(call: Call<MealResponse>, response: Response<MealResponse>) {

                Log.w("RemoteDataSource", "Jestem tu")
                if (response.code() == 200) {
                    mealsData = response.body()!!
                    Log.w("RemoteDataSource", response.body()!!.results.toString())
                }else {
                    Log.w("RemoteDataSource", response.code().toString())
//                    var result: Result = null!!
//                    result.name = meal
//                    result.thumbnail = "zdj.jpg"
//                    result.ingredients = ingredient
//                    result.href = "www.brak-neta.com"
//                    mealsData = MealResponse()
//                    mealsData.results.add(result)
                }

            }

            override fun onFailure(call: Call<MealResponse>, t: Throwable) {
                Log.w("RemoteDataSource", "oh niee")
                SearchViewModel.isInternet = false

            }


        } )
        Log.w("RemoteDataSource",mealsData?.results.toString())
        return mealsData?.results!!
 }
}