package com.bobijovz.weather.domain.entities

import com.bobijovz.weather.domain.entities.DataEntity

data class WeatherList(
    var cnt : Int,
    var list: List<DataEntity>
)