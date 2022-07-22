package com.jptadros.jpsnewsapp.mappers

class NewsVO(
    val url: String,
    val title: String,
    val abstract: String,
    val pubDate: String,
    val author: String
) : VisualObject {
    override val id: String
        get() = url
}
