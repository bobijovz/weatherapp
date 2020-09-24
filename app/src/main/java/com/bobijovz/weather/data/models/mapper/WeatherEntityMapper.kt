package com.bobijovz.weather.data.models.mapper

import com.bobijovz.weather.data.models.WeatherModel
import com.bobijovz.weather.domain.entities.WeatherEntity

class WeatherEntityMapper : EntityMapper<WeatherModel, WeatherEntity> {
    override fun toEntity(from: WeatherEntity): WeatherModel {
        return WeatherModel(
            from.id,
            from.main,
            from.description
        )
    }

    override fun toDomain(from: WeatherModel): WeatherEntity {
        return WeatherEntity(
            from.id,
            from.main,
            from.description
        )
    }


}