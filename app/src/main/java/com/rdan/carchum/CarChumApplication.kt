package com.rdan.carchum

import android.app.Application
import com.rdan.carchum.data.AppContainer
import com.rdan.carchum.data.AppDataContainer

class CarChumApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}