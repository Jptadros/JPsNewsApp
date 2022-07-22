package com.jptadros.jpsnewsapp

import android.annotation.SuppressLint
import android.view.View

@SuppressLint("StaticFieldLeak")
object Constants {

    lateinit var viewSignup:View
    const val BASE_URL = "https://api.nytimes.com/svc/topstories/v2/svc/topstories/v2/"
    const val MID_URL = "world.json?api_key"
    const val API_KEY = "SNGOPfEuVSx2yVqbCEjQxS00JyAkQK9S"
}