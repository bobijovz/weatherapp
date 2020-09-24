package com.bobijovz.weather.domain.repositories

import com.bobijovz.weather.common.wrapper.ResultWrapper
import com.bobijovz.weather.domain.entities.DataEntity
import com.bobijovz.weather.domain.entities.WeatherList
import kotlinx.coroutines.Deferred

interface WeatherRepository {
    suspend fun getWeatherListAsync() : Deferred<ResultWrapper<Exception, WeatherList>>
    suspend fun getWeatherAsync() : Deferred<ResultWrapper<Exception, DataEntity>>
}