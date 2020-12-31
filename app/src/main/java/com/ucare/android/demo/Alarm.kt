package com.ucare.android.demo

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp
import java.util.*
/**
 * Room entity class, so this class will be stored / fetched from/to SQLIte
 * using the Room ORM library.
 */
@Entity
data class Alarm (@PrimaryKey val id :UUID =UUID.randomUUID(),
                var type:String="",
                  var timestamp: Timestamp,
                  var emergency: EmergencyLevel,
                  var alarmType: AlarmType,
                  var confidenceLevel: ConfidenceLevel,
                  var payload : String
                  )