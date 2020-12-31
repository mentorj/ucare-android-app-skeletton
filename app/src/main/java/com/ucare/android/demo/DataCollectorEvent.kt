package com.ucare.android.demo

/**
 * This event class is emitted once DataCollectorService has finished to gather
 * enough data to start computation. Highly coupled with data read from sensors...
 */
data class DataCollectorEvent (val ts:Long)