package com.example.data.network

import android.util.Log
import com.example.domain.Movie
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json

interface MoviesApiService {

    suspend fun getMoviesList(): List<Movie>

    companion object Factory {
        val TAG_KTOR_LOGGER = MoviesApiService::class.java.simpleName

        fun build(): MoviesApiService {

            return MoviesApiServiceImpl(

                httpClient = HttpClient(Android) {
                    install(JsonFeature) {
                        serializer = KotlinxSerializer(
                            kotlinx.serialization.json.Json {
                                ignoreUnknownKeys = true
                            }
                        )
                    }
                    install(Logging) {
                        logger = object : Logger {
                            override fun log(message: String) {
                                Log.v(TAG_KTOR_LOGGER, message)
                            }

                        }
                        level = LogLevel.ALL
                    }
                    defaultRequest {
                        contentType(ContentType.Application.Json)
                        accept(ContentType.Application.Json)
                    }
                }

            )
        }
    }
}