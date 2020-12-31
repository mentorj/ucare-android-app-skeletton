package com.ucare.android.demo

/**
 * this enum defines the type of alarm
 */
enum class AlarmType (val type :Int) {
    TECHNICAL(0),
    SYSTEM(5),
    USER(10)
}