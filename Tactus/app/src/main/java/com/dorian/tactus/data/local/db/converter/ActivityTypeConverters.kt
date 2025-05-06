package com.dorian.tactus.data.local.db.converter

import androidx.room.TypeConverter
import com.dorian.tactus.domain.model.ActivityType

class ActivityTypeConverters {

    @TypeConverter
    fun fromActivityType(value: ActivityType): String = value.name

    @TypeConverter
    fun toActivityType(value: String): ActivityType = ActivityType.valueOf(value)
}