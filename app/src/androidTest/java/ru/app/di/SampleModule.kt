package ru.app.di

import dagger.Module
import dagger.Provides

@Module
class SampleModule {

    @Provides
    fun provideSampleDep(): SampleDependency {
        return SampleDependency()
    }
}