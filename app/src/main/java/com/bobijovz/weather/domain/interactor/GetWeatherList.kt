package com.bobijovz.weather.domain.interactor

import com.bobijovz.weather.common.wrapper.ResultWrapper
import com.bobijovz.weather.domain.entities.WeatherList
import com.bobijovz.weather.domain.repositories.WeatherRepository
import kotlinx.coroutines.Deferred

class GetWeatherList(var repository: WeatherRepository) :
    BaseInteractor<Deferred<ResultWrapper<Exception, WeatherList>>>() {
    override suspend fun <P> executeAsync(vararg params: P):
            Deferred<ResultWrapper<Exception, WeatherList>> = repository.getWeatherListAsync()
}