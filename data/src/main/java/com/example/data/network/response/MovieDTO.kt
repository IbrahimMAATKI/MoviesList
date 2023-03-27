package com.example.data.network.response

import com.example.domain.Movie
import com.squareup.moshi.JsonClass
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@JsonClass(generateAdapter = true)
data class MovieDTO(
    val title: String?,
    val year: String?,
    val director: String?,
    val posterUrl: String?,
)

fun MovieDTO.toMovie(): Movie {
    return Movie(
        title = title,
        year = year,
        director = director,
        posterUrl = posterUrl
    )
}

