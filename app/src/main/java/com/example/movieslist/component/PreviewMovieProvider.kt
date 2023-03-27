package com.example.movieslist.component

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.domain.Movie

class PreviewMovieProvider : PreviewParameterProvider<Movie> {
    override val values: Sequence<Movie>
        get() = sequenceOf(
            Movie(1, "test1", "2019", "test1", "test1"),
            Movie(2, "test2", "2019", "test2", "test2")
        )
}