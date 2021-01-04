package com.ucare.android.demo

/**
 * Defines what kind of sensor emits data
 */
enum class SensorType (val type:Int){
    ACCELERO_METER(0),
    PPG(1),
    BATTERY(2),
    TEMPERATURE(3)
}