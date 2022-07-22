package com.jptadros.jpsnewsapp.JsontoKotlin

data class NewsData(
    val copyright: String,
    val last_updated: String,
    val num_results: Int,
    val results: List<Result>,
    val section: String,
    val status: String
)