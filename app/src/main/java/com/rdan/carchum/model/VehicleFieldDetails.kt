package com.rdan.carchum.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(
    tableName = "vehicle_field_details",
    foreignKeys = [
        ForeignKey(
            entity = Vehicle::class,
            parentColumns = ["id"],
            childColumns = ["vehicle_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class VehicleFieldDetails(
    @PrimaryKey(autoGenerate = true)
    val id: UUID,

    @ColumnInfo("vehicle_id", index = true)
    val vehicleId: UUID,

    @ColumnInfo(name = "created_at")
    val createdAt: Long,

    @ColumnInfo("key")
    val key: String,

    @ColumnInfo("value")
    val value: String,
)
