package com.ucare.android.demo

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

/**
 * Room uses this class to create table into SQLite
 */
@Database(entities = [Alarm::class],version = 1)
@TypeConverters(CustomRoomTypeConverter::class)
abstract class AlarmDatabase : RoomDatabase() {
}