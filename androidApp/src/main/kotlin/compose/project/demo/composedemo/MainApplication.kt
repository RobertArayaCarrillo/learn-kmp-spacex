package compose.project.demo.composedemo

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import compose.project.demo.composedemo.di.initKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@MainApplication)
            androidLogger()
        }
    }
}