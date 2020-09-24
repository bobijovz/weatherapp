package com.bobijovz.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherweather.core.base.BaseActivity

class MainActivity : BaseActivity() {
    override val layoutRes: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}