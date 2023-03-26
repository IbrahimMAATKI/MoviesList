package com.example.data.db.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Movies")
data class MovieDataEntity(
    @PrimaryKey(autoGenerate = true)
    val movieId: Int = 0,
    val title: String?,
    val year: String?,
    val director: String?,
    val posterUrl: String?
)