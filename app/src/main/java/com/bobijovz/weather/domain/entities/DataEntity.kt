package com.bobijovz.weather.domain.entities

data class DataEntity (
    var dt : Int,
    var id : Int,
    var name : String,
    var main: MainEntity,
    var weather: List<WeatherEntity>
)

