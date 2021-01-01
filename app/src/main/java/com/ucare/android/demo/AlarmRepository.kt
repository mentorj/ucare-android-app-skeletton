package com.ucare.android.demo

import android.content.Context

/**
 * This is the only way to access the database from the Application
 * Recommended approach from Google
 * Uses a companion object to provide DP factory like access
 */
class AlarmRepository private constructor (context:Context){
    companion object {
        private var INSTANCE : AlarmRepository? = null

        fun initialize (context: Context){
            if (INSTANCE == null){
                INSTANCE = AlarmRepository(context)
            }
        }

        fun getInstance() : AlarmRepository{
            return INSTANCE ?: throw IllegalStateException("AlarmRepository not initialized")
        }
    }
}