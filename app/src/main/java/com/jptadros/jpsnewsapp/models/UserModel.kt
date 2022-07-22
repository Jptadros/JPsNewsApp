package com.jptadros.jpsnewsapp.models


import java.io.Serializable

/**
 * A Data Model Class for Happy Place details. We will you this data class in all over the project even when
 * dealing with local SQLite database.
 */
data class UserModel(
    val id: Int,
    val fName: String,
    val lName: String,
    val email: String,
    val password: String,
    val image: String

) : Serializable


