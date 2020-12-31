package com.ucare.android.demo

import androidx.room.TypeConverter
import java.util.*

/**
 * This class is used to handle marshalling & unmarshalling
 * of complex types from/to SQLIte by Room framework
 * It is a collection of little mapper functions transforming complex types to elementary oness.
 */
class CustomRoomTypeConverter {
    @TypeConverter
    fun fromUUID2String(uuid:UUID?):String?{
        return uuid?.toString()
    }

    @TypeConverter
    fun fromString2UUID(uuid: String?):UUID?{
        return UUID.fromString(uuid)
    }

    @TypeConverter
    fun fromEmergencyLevel(level:EmergencyLevel?) : Int?{
        return level?.level
    }

    @TypeConverter
    fun fromIntToEmergencyLevel(level:Int?) : EmergencyLevel{
        return EmergencyLevel.values().asList().filter { e -> e.level==level }.first()

    }

    @TypeConverter
    fun fromAlarmTypeToInt(type :AlarmType?) : Int?{
        return type?.type
    }

    @TypeConverter
    fun fromInt2AlaramType(type :Int?) :AlarmType?{
        return AlarmType.values().asList().filter { t -> t.type == type }.first()
    }

    @TypeConverter
    fun fromConfidenceLevel2Int(level:ConfidenceLevel?):Int?{
        return level?.level
    }

    @TypeConverter
    fun fromInt2ConfidenceLevel(level:Int?):ConfidenceLevel?{
        return ConfidenceLevel.values().asList().filter { c -> c.level==level }.first()
    }
}