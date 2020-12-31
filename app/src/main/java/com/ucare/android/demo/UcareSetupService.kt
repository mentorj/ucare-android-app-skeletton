package com.ucare.android.demo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

/**
 * This is the main service  acting as a leader and installing other services
 * Will be started by the activity (for the moment waiting for a better solution)
 */
class UcareSetupService : Service() {
    private val TAG:String="UcareSetupService"

    override fun onBind(intent: Intent?): IBinder? {
        Log.d(TAG,"onBind() called, why ?")
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG,"onStartedCommand called")
        // create intents then start services using intents
        val collectorIntent :Intent = Intent(this,DataCollectorService::class.java)
        val aggregatorIntent:Intent = Intent(this,DataAgrregatorService::class.java)
        val decisionTreeIntent:Intent = Intent(this,DecisionTreeService::class.java)
        startService(collectorIntent)
        startService(aggregatorIntent)
        startService(decisionTreeIntent)
        Log.i(TAG,"onStartCOmmand() finished, service about starting")
        return Service.START_STICKY
    }
}