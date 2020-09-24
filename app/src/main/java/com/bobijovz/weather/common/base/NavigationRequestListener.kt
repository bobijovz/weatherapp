package com.bobijovz.weather.common.base

import com.bobijovz.weather.presentation.navigation.NavigationRequest


interface NavigationRequestListener {
    fun onNavigationRequest(navigationRequest: NavigationRequest)
}