package com.example.weatherweather.core.base

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import com.bobijovz.weather.common.base.NavigationRequestListener

abstract class BaseFragment : Fragment(), NavigationRequestListener {

    @get:LayoutRes
    protected abstract val layoutRes: Int

    protected fun navigate(destination: NavDirections) {
        view?.findNavController()?.navigate(destination)
    }

}