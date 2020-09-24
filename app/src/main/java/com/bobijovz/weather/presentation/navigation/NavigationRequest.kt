package com.bobijovz.weather.presentation.navigation

import androidx.navigation.NavDirections

sealed class NavigationRequest(val destination: NavDirections) {
    /*data class ListToDetail(val param: MovieDetailParameter) :
        NavigationRequest(MovieListFragmentDirections.actionMovieListFragmentToMovieDetailFragment(param))*/
}