package com.example.kontak

import android.app.Application
import com.example.kontak.Repositori.AppContainer
import com.example.kontak.Repositori.KontakContainer

class KontakApplication : Application(){
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}