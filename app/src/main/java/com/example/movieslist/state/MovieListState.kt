package com.example.movieslist.state

import com.example.domain.Movie
import com.example.movieslist.util.ProgressBarState
import com.example.movieslist.util.Queue
import com.example.movieslist.util.UIComponent

data class MovieListState(
    val progressBarState: ProgressBarState = ProgressBarState.Idle,
    val movies: List<Movie> = listOf(),
    val api_key: String = "",
    val page: Int = 1,
    val isPageAvailable: Boolean = true,
    val errorQueue: Queue<UIComponent> = Queue(mutableListOf()),
)
