package com.bobijovz.weather.data.datasources

import com.bobijovz.weather.common.wrapper.ResultWrapper
import com.bobijovz.weather.data.models.response.DataModel
import com.bobijovz.weather.data.models.response.WeatherListResponse
import kotlinx.coroutines.Deferred

interface OpenWeatherMapDataSource {
    suspend fun getWeatherListAsync() : Deferred<ResultWrapper<Exception, WeatherListResponse>>
    suspend fun getWeatherAsync() : Deferred<ResultWrapper<Exception, DataModel>>
}