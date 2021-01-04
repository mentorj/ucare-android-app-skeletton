package com.ucare.android.demo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity
data class RawData (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    var timestamp:Long,
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    var data:ByteArray,
    var sensorType:SensorType
)