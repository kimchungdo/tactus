package com.dorian.tactus.data.local.db.converter

import androidx.room.TypeConverter
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class OffsetDateTimeConverter {
    private val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME

    @TypeConverter
    fun fromOffsetDateTime(value: OffsetDateTime): String = value.format(formatter)

    @TypeConverter
    fun toOffsetDateTime(value: String): OffsetDateTime = OffsetDateTime.parse(value, formatter)
}