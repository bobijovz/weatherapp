package com.bobijovz.weather.domain.interactor


import com.bobijovz.weather.common.wrapper.ResultWrapper
import com.bobijovz.weather.domain.entities.DataEntity
import com.bobijovz.weather.domain.repositories.WeatherRepository
import kotlinx.coroutines.Deferred

class GetWeather(var repository: WeatherRepository) :
    BaseInteractor<Deferred<ResultWrapper<Exception, DataEntity>>>() {
    override suspend fun <P> executeAsync(vararg params: P):
            Deferred<ResultWrapper<Exception, DataEntity>> = repository.getWeatherAsync()
}