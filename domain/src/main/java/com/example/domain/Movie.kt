package com.example.domain

data class Movie(
    val id: Int = 0,
    val title: String?,
    val year: String?,
    val director: String?,
    val posterUrl: String?
)