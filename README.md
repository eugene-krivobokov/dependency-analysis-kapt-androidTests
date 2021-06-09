This is a sample app for [dependency-analysis-android-gradle-plugin/411](https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/issues/411) issue.

How to reproduce:

```shell
./gradlew buildHealth
```

Expected result: 
no errors

Actual result:

```text
 Advice for project :app
  Plugin advice:
  - kotlin-kapt: this project has the kotlin-kapt (org.jetbrains.kotlin.kapt) plugin applied, but no annotation processors (or no used annotation processors), which is redundant.
```

The app uses kapt in instrumentation tests. Run `ExampleTest` to check it.