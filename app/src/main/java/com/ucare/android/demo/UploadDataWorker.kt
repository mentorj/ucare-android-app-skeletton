package com.ucare.android.demo

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

/**
 * this class is scheduled through  Android WorkManager to
 * upload data several times (to be fixed) a day to Ucare platform
 * it sends  data as MQTT messages payload with Paho library
 */
class UploadDataWorker(appContext: Context,workerParameters: WorkerParameters):Worker(appContext,workerParameters){
    private var TAG :String = "UploadDataWorker"
    override fun doWork(): Result {
        Log.d(TAG,"starting data upload")
        // grab data
        // prepare MQTT message
        // send it
        var result :Result = Result.success()
        Log.i(TAG,"Upload data finished")
        return  result
    }

}