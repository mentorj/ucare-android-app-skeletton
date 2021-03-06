package com.ucare.android.demo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query



@Dao
interface AlarmDao {
    @Query("SELECT * FROM alarm")
    fun listAlarms():List<Alarm>

    @Query("SELECT * FROM alarm WHERE  id=(:id)")
    fun fetchAlarmById(id:Int):Alarm?

    @Insert
    fun insertAlarm(alarm: Alarm?) : Long?

    @Insert
    fun insertAlarmsList(alarms:List<Alarm>?):List<Long>?

    @Query("SELECT *  from rawdata")
    fun listRawData():List<RawData>

    @Query("SELECT * FROM rawdata where sensorType=(:sensorType) AND  timestamp>(:fromTs)")
    fun fetchLastDataByType(sensorType: SensorType,fromTs:Long):List<RawData>

    @Insert
    fun insertRawData(data: RawData):Long

    @Insert
    fun insertRawDataList(dataSet : List<RawData>):List<Long>
}