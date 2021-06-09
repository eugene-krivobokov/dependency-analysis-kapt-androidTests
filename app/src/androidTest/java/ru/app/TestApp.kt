package ru.app

import android.app.Application
import android.util.Log
import ru.app.di.DaggerSampleComponent
import ru.app.di.SampleDependency
import javax.inject.Inject

class TestApp : Application() {

    @Inject
    lateinit var dep: SampleDependency

    override fun onCreate() {
        super.onCreate()
        Log.i("TestApp", "onCreate")

        DaggerSampleComponent.builder()
            .build()
            .inject(this)

        Log.i("TestApp", "from kapt: $dep")
    }
}