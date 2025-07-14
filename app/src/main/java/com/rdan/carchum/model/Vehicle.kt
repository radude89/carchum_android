package com.rdan.carchum.model

import androidx.compose.ui.graphics.Color
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.util.UUID

@Entity(tableName = "vehicles")
data class Vehicle(
    @PrimaryKey(autoGenerate = true)
    val id: UUID,

    @ColumnInfo(name = "created_at")
    val createdAt: Long,

    @ColumnInfo("make")
    val make: String,

    @ColumnInfo("model")
    val model: String,

    @ColumnInfo("number_plate")
    val numberPlate: String,

    @ColumnInfo(name = "color")
    val color: Color,

    @Relation(
        entity = VehicleFieldDetails::class,
        parentColumn = "id",
        entityColumn = "vehicle_id"
    )
    val customFields: List<VehicleFieldDetails>
)