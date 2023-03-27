package com.example.data.network

import com.example.data.network.response.MovieDTO
import com.example.data.network.response.toMovie
import com.example.domain.Movie
import io.ktor.client.*
import io.ktor.client.request.*


class MoviesApiServiceImpl(private val httpClient: HttpClient) : MoviesApiService {


    override suspend fun getMoviesList(): List<Movie> {

        return httpClient.get<List<MovieDTO>> {
            url("da/FakeAPI/movies.json")
        }.map {
            it.toMovie()
        }
    }


}