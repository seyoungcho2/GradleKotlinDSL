buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(ProjectDependencies.androidBuildTool)
        classpath(ProjectDependencies.kotlinGradlePlugin)
        classpath(ProjectDependencies.hiltAndroidGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}