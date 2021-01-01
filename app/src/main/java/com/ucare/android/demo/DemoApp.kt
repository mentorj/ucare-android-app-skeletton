package com.ucare.android.demo

import android.app.Application
import android.util.Log
import androidx.room.Room
import org.greenrobot.eventbus.EventBus

class DemoApp : Application() {
    private val  TAG :String = "Ucare Demo App"
    companion object {
        var database: AlarmDatabase? = null
    }
    override fun onCreate() {
        super.onCreate()
        Log.i(TAG,"starting  Ucare demo app...")
        AlarmRepository.initialize(this)
        // install as default event bus the one using the custom index
        // TRICK to improve performance
        EventBus.builder().addIndex(MyEventBusIndex()).installDefaultEventBus()

        Log.d(TAG,"EventBus initialized with custom index")
        // init DB
        DemoApp.database = Room.databaseBuilder(this, AlarmDatabase::class.java, "alarms-db").build()
        Log.d(TAG,"database initialized")

        Log.i(TAG,"application init finished")
    }
}
