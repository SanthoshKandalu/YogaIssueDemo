package com.example.yogaissuedemo

import android.app.Application
import com.facebook.soloader.SoLoader

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }
}