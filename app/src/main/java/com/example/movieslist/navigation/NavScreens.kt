package com.example.movieslist.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.domain.Movie

sealed class NavScreens(val route: String, val arguments: List<NamedNavArgument>){

    object MovieList: NavScreens(
        route = "movieList",
        arguments = emptyList()
    )

    object MovieDetail: NavScreens(
        route = "movieDetail",
        arguments = emptyList()
//        arguments = listOf(navArgument("Movie") {
//            type = NavType.ParcelableType
//        }
        )

}