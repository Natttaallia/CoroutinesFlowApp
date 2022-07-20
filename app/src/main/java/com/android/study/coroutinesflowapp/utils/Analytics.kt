package com.android.study.coroutinesflowapp.utils

import android.util.Log
import javax.inject.Inject

/**
 * @author Kulbaka Nataly
 * @date 21.07.2022
 */
class Analytics @Inject constructor() {

    fun sendAnalytics() {
        Log.w("Analytics", "Send")
    }
}