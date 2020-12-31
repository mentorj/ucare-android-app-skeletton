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
        TODO("Not yet implemented")
        Log.d(TAG,"onBind() called")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG,"onStartedCommand called")
        return super.onStartCommand(intent, flags, startId)
    }
}