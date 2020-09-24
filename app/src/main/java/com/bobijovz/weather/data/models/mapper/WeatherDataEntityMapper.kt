package com.bobijovz.weather.data.models.mapper

import com.bobijovz.weather.data.models.response.DataModel
import com.bobijovz.weather.domain.entities.DataEntity

class WeatherDataEntityMapper : EntityMapper<DataModel, DataEntity> {

    override fun toEntity(from: DataEntity): DataModel {
        return DataModel(
            from.dt,
            from.id,
            from.name,
            WeatherMainEntityMapper().toEntity(from.main),
            WeatherEntityMapper().toEntity(from.weather)
        )
    }

    override fun toDomain(from: DataModel): DataEntity {
        return DataEntity(
            from.dt,
            from.id,
            from.name,
            WeatherMainEntityMapper().toDomain(from.main),
            WeatherEntityMapper().toDomain(from.weather)
        )
    }

}