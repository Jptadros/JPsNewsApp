package com.jptadros.jpsnewsapp.models

data class ApiCallData(
    val copyright: String,
    val last_updated: String,
    val num_results: Int,
    val results: List<NewsResultModel>,
    val section: String,
    val status: String
)