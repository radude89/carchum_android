package com.rdan.carchum.converters

import androidx.compose.ui.graphics.Color
import androidx.room.TypeConverter

class ColorConverter {
    @TypeConverter
    fun fromColor(color: Color): Int {
        return color.value.toInt() // Store as an Int (ARGB)
    }

    @TypeConverter
    fun toColor(value: Int): Color {
        return Color(value)
    }
}