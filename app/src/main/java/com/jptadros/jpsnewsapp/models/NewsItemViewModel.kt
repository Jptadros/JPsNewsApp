package com.jptadros.jpsnewsapp.models

data class NewsItemViewModel(

    val abstract: String, //This is the heading after the title
    val published_date: String, //Date
    val section: String, //Part of the world
    val subsection: String, //Politics, Sport, Business....
    val title: String, // This is the title
    val url: String, //Open this in webView.
    val byline: String//Author
)
