package com.ucare.android.demo

/**
 * this enum should be used to define confidence level for any alarm raised
 */
enum class ConfidenceLevel(val level:Int) {
    LOW(0),
    MEDIUM(5),
    HIGH(10)
}