package com.ucare.android.demo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * This service waits for raw data comming from sensors
 * and launches long computations to get
 */
class DataAgrregatorService : Service() {
    private val TAG : String = "DataAggregatorService"

    override fun onBind(intent: Intent?): IBinder? {
        Log.d(TAG,"obBind() starts")
        // WARNING : important to register on the bus
        // we should also unregister when stopping the service..
        EventBus.getDefault().register(this)
        // @TODO change me
        return null
    }

    private fun computeData(): AggregatedDataEvent{
        //@TODO change me !!
        var computed :AggregatedDataEvent = AggregatedDataEvent("toto")
        //....
        return computed
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    fun  handleNewDataArrivesEvent(evt : DataCollectorEvent ){
        Log.d(TAG,"new data arrived from sensors")

        // launch computation
        val computed = computeData()
        Log.i(TAG, "data handled now posting results")
        EventBus.getDefault().post(computed)
        Log.v(TAG,"data handling finished ")
    }
}