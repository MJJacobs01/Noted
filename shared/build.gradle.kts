import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import za.co.mjjacobs.noted.*

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    
    jvm("server")
    
    sourceSets {
        val serverMain by getting
        
        commonMain.dependencies {
            // put your Multiplatform dependencies here
        }
        
        serverMain.dependencies {
            //  put your Server dependencies here
        }
    }
}

android {
    namespace = Constants.sharedNameSpace
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    
    compileOptions {
        sourceCompatibility = Constants.javaVersion
        targetCompatibility = Constants.javaVersion
    }
    
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}
