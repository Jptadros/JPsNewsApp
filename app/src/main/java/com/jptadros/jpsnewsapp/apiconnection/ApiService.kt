package com.jptadros.jpsnewsapp.apiconnection

import com.jptadros.jpsnewsapp.Constants
import com.jptadros.jpsnewsapp.JsontoKotlin.NewsData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("svc/topstories/v2/world.json")
    fun getNews(@Query("api-key") apikey: String = Constants.API_KEY): Call<NewsModel>
}