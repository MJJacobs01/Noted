import za.co.mjjacobs.noted.*

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.kspPlugin)
    alias(libs.plugins.hilt)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.composeCompiler)
}

android {
    namespace = Constants.navigationNamespace
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
        
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    
    compileOptions {
        sourceCompatibility = Constants.javaVersion
        targetCompatibility = Constants.javaVersion
    }
    
    kotlinOptions {
        jvmTarget = Constants.jvmTarget
    }
    
    buildFeatures {
        compose = true
    }
}

dependencies {
    
    //  Compose
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(compose.preview)
    implementation(compose.runtime)
    implementation(compose.foundation)
    implementation(compose.material3)
    implementation(compose.ui)
    implementation(compose.components.resources)
    implementation(compose.components.uiToolingPreview)
    implementation(libs.androidx.lifecycle.viewmodel)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.materialIconsExtended)
    
    //  Jetpack Navigation
    implementation(libs.navigation)
    
    //  Hilt Navigation Compose
    implementation(libs.hiltNavigationCompose)
    implementation(libs.hiltAndroid)
    implementation(libs.androidx.junit.ktx)
    ksp(libs.hiltAndroidCompiler)
    
    //  Serialization
    implementation(libs.serializationJson)
    
    //  Window
    implementation(libs.window)
    
    testImplementation(kotlin("test"))
    androidTestImplementation(kotlin("test"))
    androidTestImplementation(libs.kotlin.test.junit)
}

tasks.withType<Test> {
    useJUnitPlatform()
}