import app.AppDependencies.androidCoreDependencies
import app.AppDependencies.asyncDependencies
import app.AppDependencies.diDependencies
import app.AppDependencies.jetpackDependencies
import app.AppDependencies.networkDependencies
import app.AppDependencies.rxJavaDependencies
import app.AppDependencies.testDependencies
import app.AppDependencies.uiDependencies
import common.GradleUtil.implement

plugins {
    id(app.Plugins.androidApplication)
    id(app.Plugins.kotlinAndroid)
    id(app.Plugins.kotlinKapt)
    id(app.Plugins.kotlinParcelize)
    id(app.Plugins.daggerPlugin)
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "com.teamcarelab.gradlekotlindsl"
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    diDependencies.implement(this)
    jetpackDependencies.implement(this)
    networkDependencies.implement(this)
    asyncDependencies.implement(this)
    uiDependencies.implement(this)
    testDependencies.implement(this)
    androidCoreDependencies.implement(this)
    rxJavaDependencies.implement(this)
}