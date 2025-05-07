package com.dorian.tactus.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dorian.tactus.data.local.db.converter.ActivityTypeConverters
import com.dorian.tactus.data.local.db.converter.OffsetDateTimeConverter
import com.dorian.tactus.data.local.db.entity.ActivityResult

@TypeConverters(
    ActivityTypeConverters::class,
    OffsetDateTimeConverter::class
)
@Database(
    entities = [ActivityResult::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
}