package com.jptadros.jpsnewsapp.NewsDb

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        NewsDb::class

    ],
    version = 2
)
abstract class NewsDatabase : RoomDatabase() {

    abstract fun newsDao(): NewsDao

}