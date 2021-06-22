package app

import common.DependencyInfo
import common.Method

object AppDependencies {
    val roomDependencies = arrayOf(
        DependencyInfo("androidx.room:room-runtime", Versions.roomVersion, Method.IMPLEMENTATION),
        DependencyInfo("androidx.room:room-compiler", Versions.roomVersion, Method.KAPT),
        DependencyInfo("androidx.room:room-ktx", Versions.roomVersion, Method.IMPLEMENTATION),
        DependencyInfo("androidx.room:room-testing", Versions.roomVersion, Method.TESTIMPLEMENTATION)
    )

    private val navigationDependencies = arrayOf(
        DependencyInfo("androidx.navigation:navigation-fragment-ktx", Versions.navigationVersion, Method.IMPLEMENTATION),
        DependencyInfo("androidx.navigation:navigation-ui-ktx", Versions.navigationVersion, Method.IMPLEMENTATION),
        DependencyInfo("androidx.navigation:navigation-dynamic-features-fragment", Versions.navigationVersion, Method.IMPLEMENTATION),
        DependencyInfo("androidx.navigation:navigation-testing", Versions.navigationVersion, Method.IMPLEMENTATION)
    )


    private val hiltDependencies = arrayOf(
        DependencyInfo("com.google.dagger:hilt-android", Versions.hiltVersion, Method.IMPLEMENTATION),
        DependencyInfo("com.google.dagger:hilt-android-compiler", Versions.hiltVersion, Method.KAPT)
    )


    private val retrofitDependencies = arrayOf(
        DependencyInfo("com.squareup.retrofit2:retrofit", Versions.retrofitVersion, Method.IMPLEMENTATION),
        DependencyInfo("com.squareup.retrofit2:converter-moshi", Versions.retrofitVersion, Method.IMPLEMENTATION)
    )

    private val okhttpDependencies = arrayOf(
        DependencyInfo("com.squareup.okhttp3:logging-interceptor", Versions.okhttpVersion, Method.IMPLEMENTATION),
        DependencyInfo("com.squareup.okhttp3:mockwebserver", Versions.okhttpVersion, Method.TESTIMPLEMENTATION)
    )


     val moshiDependencies = arrayOf(
        DependencyInfo("com.squareup.moshi:moshi-kotlin", Versions.moshiVersion, Method.IMPLEMENTATION),
        DependencyInfo("com.squareup.moshi:moshi-kotlin-codegen", Versions.moshiVersion, Method.KAPT)
    )

    private val coroutineDependencies = arrayOf(
        DependencyInfo("org.jetbrains.kotlinx:kotlinx-coroutines-android", Versions.coroutinesVersion, Method.IMPLEMENTATION),
        DependencyInfo("org.jetbrains.kotlinx:kotlinx-coroutines-android", Versions.coroutinesVersion, Method.TESTIMPLEMENTATION),
        DependencyInfo("org.jetbrains.kotlinx:kotlinx-coroutines-test", Versions.coroutinesVersion, Method.TESTIMPLEMENTATION)
    )

    private val glideDependencies = arrayOf(
        DependencyInfo("com.github.bumptech.glide:glide", Versions.glideVersion, Method.IMPLEMENTATION),
        DependencyInfo("com.github.bumptech.glide:compiler", Versions.glideVersion, Method.KAPT)
    )

    private val androidTestDependencies = arrayOf(
        DependencyInfo("junit:junit", Versions.junitVersion, Method.TESTIMPLEMENTATION),
        DependencyInfo("androidx.test.ext:junit", Versions.androidJUnitVersion, Method.ANDROIDTESTIMPLEMENTATION),
        DependencyInfo("androidx.test.espresso:espresso-core", Versions.espressoVersion, Method.ANDROIDTESTIMPLEMENTATION)
    )

    val androidCoreDependencies = arrayOf(
        DependencyInfo("org.jetbrains.kotlin:kotlin-stdlib", Versions.kotlinVersion, Method.IMPLEMENTATION),
        DependencyInfo("androidx.core:core-ktx", Versions.androidCoreVersion, Method.IMPLEMENTATION),
        DependencyInfo("androidx.appcompat:appcompat", Versions.androidAppCompatVersion, Method.IMPLEMENTATION),
        DependencyInfo("com.jakewharton.timber:timber", Versions.timberVersion, Method.IMPLEMENTATION)
    )

    val rxJavaDependencies = arrayOf(
        DependencyInfo("io.reactivex.rxjava3:rxandroid",Versions.rxAndroidVersion,Method.IMPLEMENTATION),
        DependencyInfo("io.reactivex.rxjava3:rxjava", Versions.rxJavaVersion, Method.IMPLEMENTATION)
    )

    val jetpackDependencies = arrayOf(roomDependencies, navigationDependencies)

    val diDependencies = arrayOf(hiltDependencies)

    val networkDependencies = arrayOf(retrofitDependencies, okhttpDependencies, moshiDependencies)

    val asyncDependencies = arrayOf(coroutineDependencies)

    val uiDependencies = arrayOf(glideDependencies)

    val testDependencies = arrayOf(androidTestDependencies)
}