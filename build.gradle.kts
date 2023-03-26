buildscript {
    extra.apply{
        set("compose_version","1.3.3")
    }
    repositories {
        google()
        mavenCentral()
    }
    dependencies {

        classpath(Build.androidBuildTools)
        classpath(Build.kotlinGradlePlugin)
        classpath(Build.hiltAndroid)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}