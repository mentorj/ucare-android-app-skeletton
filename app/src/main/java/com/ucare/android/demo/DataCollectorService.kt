package com.ucare.android.demo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import org.greenrobot.eventbus.EventBus

/**
 * This service manages collection of data through sensors
 * Emits results through EventBus to start computations
 */
class DataCollectorService : Service() {
    private val TAG :String = "DataCollectorService"

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    fun collectData(){
        Log.d(TAG,"handling data collection")
        //....
        Log.i(TAG,"data collection is over ...posting event ")
        EventBus.getDefault().post(null)
    }
}