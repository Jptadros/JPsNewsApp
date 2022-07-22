package com.jptadros.jpsnewsapp.NewsDb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news")
class NewsDb(

    @PrimaryKey
    @ColumnInfo(name = "url")
    val url: String,

    @ColumnInfo(name = "abstract")
    val abstract: String,

    @ColumnInfo(name = "author")
    val byline: String,

    @ColumnInfo(name = "published_date")
    val published_date: String,

    @ColumnInfo(name = "title")
    val title: String
)