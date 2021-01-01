package com.ucare.android.demo

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.sql.Timestamp
import java.util.*
/**
 * Room entity class, so this class will be stored / fetched from/to SQLIte
 * using the Room ORM library.
 * Defines a couple of indices to be placed on this table
 */
@Entity(indices = arrayOf(Index(value = ["timestamp","alarmType"])) )
data class Alarm (@PrimaryKey(autoGenerate = true) val id :Int,
                var type:String="",
                  var timestamp: Long,
                  var emergency: EmergencyLevel,
                  var alarmType: AlarmType,
                  var confidenceLevel: ConfidenceLevel,
                  var payload : String
                  )