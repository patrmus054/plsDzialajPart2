package com.example.mehhhh.remote

import com.google.gson.annotations.SerializedName

class MealResponse {

    @SerializedName("title")
    var title: String? = null
    @SerializedName("version")
    var version: Float? = null
    @SerializedName("href")
    var href: String? = null
    @SerializedName("results")
    var results = ArrayList<Result>()
}

class Result{
    @SerializedName("name")
    var name: String? = null
    @SerializedName("href")
    var href: String? = null
    @SerializedName("ingredients")
    var ingredients: String? = null
    @SerializedName("thumbnail")
    var thumbnail: String? = null
}
