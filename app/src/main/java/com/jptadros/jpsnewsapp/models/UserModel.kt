package com.jptadros.jpsnewsapp.models


import java.io.Serializable

data class UserModel(
    val id: Int,
    val fName: String,
    val lName: String,
    val email: String,
    val password: String,
    val image: String

) : Serializable








