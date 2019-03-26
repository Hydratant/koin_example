package com.sang.koin

import android.app.Application
import android.util.Log
import com.sang.koin.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinApplication : Application() {
    private val TAG = this.javaClass.simpleName

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "isDebug : ${applicationContext.isDebug()}")

        startKoin {

            // default Level.INFO ( DEBUG , ERROR )
            if (applicationContext.isDebug()) androidLogger()

            // Android Context given
            androidContext(this@KoinApplication)

            // load properties from assets/koin.properties file
            androidFileProperties()

            modules(appModule)
        }
    }

}