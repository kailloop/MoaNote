package kr.co.moanote

import android.app.Application
import kr.co.moanote.di.roomModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MoaApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MoaApplication)
            modules(roomModule)
        }
    }
}