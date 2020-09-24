package com.example.weatherweather.core.base

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    @get:LayoutRes
    protected abstract val layoutRes: Int


}