package com.bobijovz.weather.data.models.mapper

import com.bobijovz.weather.data.models.MainModel
import com.bobijovz.weather.domain.entities.MainEntity

class WeatherMainEntityMapper : EntityMapper<MainModel, MainEntity> {
    override fun toEntity(from: MainEntity): MainModel {
        return MainModel(
            from.temp,
            from.temp_min,
            from.temp_max
        )
    }

    override fun toDomain(from: MainModel): MainEntity {
        return MainEntity(
            from.temp,
            from.temp_min,
            from.temp_max
        )
    }


}