package ru.app.di

import dagger.Component
import ru.app.TestApp

@Component(
    modules = [
        SampleModule::class
    ]
)
interface SampleComponent {

    fun inject(app: TestApp)
}