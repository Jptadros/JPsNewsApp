package com.jptadros.jpsnewsapp.api.connection

import com.jptadros.jpsnewsapp.models.NewsResultModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NyTimesApi {
    @GET("world.json")
    fun getProperties(
        @Query("fq") category: String,
    ): Call<NewsResultModel>

}
