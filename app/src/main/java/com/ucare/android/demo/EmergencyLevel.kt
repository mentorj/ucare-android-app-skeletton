package com.ucare.android.demo

/**
 * this enum stores the level of emergency for a given alarm
 */
enum class EmergencyLevel(val level :Int) {
    LOW(0),
    MEDIUM(5),
    HIGH(10)
}