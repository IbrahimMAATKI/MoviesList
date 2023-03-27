package com.example.movieslist.util

/**
 * to handle progressbar loading.
 * */
sealed class ProgressBarState{

    object Loading: ProgressBarState()

    object Idle: ProgressBarState()

}