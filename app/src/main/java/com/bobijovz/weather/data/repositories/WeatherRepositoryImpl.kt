package com.bobijovz.weather.data.repositories

import com.bobijovz.weather.common.wrapper.ResultWrapper
import com.bobijovz.weather.data.datasources.OpenWeatherApiService
import com.bobijovz.weather.data.datasources.OpenWeatherMapDataSource
import com.bobijovz.weather.data.models.response.DataModel
import com.bobijovz.weather.data.models.response.WeatherListResponse
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import javax.inject.Singleton


@Singleton
class WeatherRepositoryImpl(
    private val service: OpenWeatherApiService
) : OpenWeatherMapDataSource {


    private fun <T> apiLaunch(requester: Deferred<T>): Deferred<ResultWrapper<Exception, T>> =
        GlobalScope.async {
            ResultWrapper.build {
                requester.await()
            }
        }

    override suspend fun getWeatherListAsync(): Deferred<ResultWrapper<Exception, WeatherListResponse>> =
        apiLaunch(service.getWeatherList())

    override suspend fun getWeatherAsync(): Deferred<ResultWrapper<Exception, DataModel>> =
        apiLaunch(service.getWeather())

}