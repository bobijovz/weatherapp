package com.bobijovz.weather.data.datasources

import com.bobijovz.weather.data.models.request.WeatherListRequest
import com.bobijovz.weather.data.models.response.DataModel
import com.bobijovz.weather.data.models.response.WeatherListResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap


//api.openweathermap.org/data/2.5/group
//api.openweathermap.org/data/2.5/weather
interface OpenWeatherApiService {

    @GET("group")
    fun getWeatherList(
       // @QueryMap param: HashMap<String, Any>
    ): Deferred<WeatherListResponse>


    @GET("weather")
    fun getWeather(
        //@QueryMap param: HashMap<String, Any>
    ): Deferred<DataModel>

}