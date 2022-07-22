package com.jptadros.jpsnewsapp.JsontoKotlin

import com.jptadros.jpsnewsapp.Constants
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {


@GET("world.json?api_key=${Constants.API_KEY}")
    fun getData(): Call<List<Result>>

}