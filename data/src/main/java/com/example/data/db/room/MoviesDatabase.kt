package com.example.data.db.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.db.room.models.MovieDataEntity

@Database(
    entities = [
        MovieDataEntity::class
    ],
    version = 1,
    exportSchema = true,
)
abstract class MoviesDatabase : RoomDatabase() {
    abstract fun MoviesDao(): MoviesDao
}