buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
    }
}

plugins {
    id("com.autonomousapps.dependency-analysis") version "0.74.0"
}

dependencyAnalysis {
    issues {
        all {
            onUnusedDependencies {
                severity("ignore")
            }
            onUsedTransitiveDependencies {
                severity("ignore")
            }
            onIncorrectConfiguration {
                severity("ignore")
            }
            onUnusedAnnotationProcessors {
                severity("fail")
            }
            onRedundantPlugins {
                severity("fail")
            }
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}