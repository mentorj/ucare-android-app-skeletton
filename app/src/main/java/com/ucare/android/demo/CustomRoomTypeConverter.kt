package com.ucare.android.demo

import androidx.room.TypeConverter
import java.util.*

/**
 * This class is used to handle marshalling & unmarshalling
 * of complex types from/to SQLIte by Room framework
 */
class CustomRoomTypeConverter {
    @TypeConverter
    fun fromUUID(uuid:UUID?):String?{
        return uuid?.toString()
    }

    @TypeConverter
    fun fromString(uuid: String?):UUID?{
        return UUID.fromString(uuid)
    }
}