package ru.app

import android.app.Application
import android.content.Intent
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule

class ScreenRule : ActivityTestRule<MainActivity>(MainActivity::class.java, true, false) {

    private val app: Application
        get() = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext as Application

    fun start() {
        val intent = Intent(app, MainActivity::class.java)
        launchActivity(intent)
    }
}