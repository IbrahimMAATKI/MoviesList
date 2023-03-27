plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.example.data"
    compileSdk = Android.compileSdk

    defaultConfig {
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true

        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    implementation(project(":domain"))

    implementation(AndroidX.coreKtx)
    implementation(Hilt.android)
    kapt(Hilt.compiler)

    implementation(Moshi.core)
    implementation(Moshi.kotlin)
    kapt(Moshi.codegen)

    implementation(Room.runtime)
    implementation(Room.ktx)
    kapt(Room.annotationProcessor)
    annotationProcessor(Room.annotationProcessor)

    coreLibraryDesugaring(Desugaring.coreLibraryDesugaring)

    implementation(Ktor.core)
    implementation(Ktor.cio)
    implementation(Ktor.clientSerialization)
    implementation(Ktor.android)
    implementation(Ktor.json)
    implementation(Ktor.logging)
}