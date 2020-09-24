package com.bobijovz.weather.data.models.response

import com.bobijovz.weather.data.models.MainModel
import com.bobijovz.weather.data.models.WeatherModel

data class DataModel (
    var dt : Int,
    var id : Int,
    var name : String,
    var main: MainModel,
    var weather: List<WeatherModel>
)

