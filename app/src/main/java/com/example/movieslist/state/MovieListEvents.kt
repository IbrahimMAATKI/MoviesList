package com.example.movieslist.state

import com.example.movieslist.util.UIComponent


sealed class MovieListEvents{

    object GetMovies : MovieListEvents()

    object GetNextPage: MovieListEvents()

    object OnRemoveHeadFromQueue: MovieListEvents()

    data class Error(
        val uiComponent: UIComponent
    ): MovieListEvents()


}
