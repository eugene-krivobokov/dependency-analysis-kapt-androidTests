package ru.app

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleTest {

    @get: Rule
    val screenRule = ScreenRule()

    @Test
    fun test() {
        screenRule.start()
    }
}