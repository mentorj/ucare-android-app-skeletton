package com.ucare.android.demo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class DecisionTreeService : Service() {
    private val TAG :String ="DecisionTreeService"
    override fun onBind(intent: Intent?): IBinder? {
        Log.d(TAG,"starts onBind()")
        EventBus.getDefault().register(this)
        // @TODO change me
        return null
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    fun handleAggregatedData(event : AggregatedDataEvent){

    }

}