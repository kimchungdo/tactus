package com.dorian.tactus.data.local.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dorian.tactus.domain.model.ActivityType
import java.time.OffsetDateTime
import java.util.UUID

@Entity
data class ActivityResult(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val activityType: ActivityType,
    val createdTime: OffsetDateTime
)
