package com.sang.koin

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager

fun Context.isDebug(): Boolean {
    var isDebug = false
    try {
        val appInfo = packageManager.getApplicationInfo(packageName, 0)
        isDebug = 0 != appInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE
    } catch (ignore: PackageManager.NameNotFoundException) {
    }
    return isDebug
}