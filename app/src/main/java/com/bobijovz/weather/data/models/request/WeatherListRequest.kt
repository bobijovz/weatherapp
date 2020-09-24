package com.bobijovz.weather.data.models.request

data class WeatherListRequest(
    var id: List<Int>,
    var appid: String,
    var units: String = "metric"
)