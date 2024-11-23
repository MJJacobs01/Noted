import za.co.mjjacobs.noted.*

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kspPlugin)
    alias(libs.plugins.room)
}

android {
    namespace = Constants.databaseNameSpace
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
        
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
        
        ksp {
            arg("generateKotlin", "true")
        }
    }
    
    room {
        schemaDirectory("$projectDir/schemas")
    }
    
    compileOptions {
        sourceCompatibility = Constants.javaVersion
        targetCompatibility = Constants.javaVersion
    }
    
    kotlinOptions {
        jvmTarget = Constants.jvmTarget
    }
}

dependencies {
    implementation(projects.shared)
    
    //  Hilt
    implementation(libs.hiltAndroid)
    implementation(libs.androidx.junit.ktx)
    ksp(libs.hiltAndroidCompiler)
    
    //  Kotlin date time
    implementation(libs.kotlinDateTime)
    
    //  Room
    implementation(libs.roomRuntime)
    implementation(libs.roomKtx)
    ksp(libs.roomCompiler)
    
    //  Testing
    testImplementation(libs.roomTesting)
    
    testImplementation(kotlin("test"))
    androidTestImplementation(kotlin("test"))
    androidTestImplementation(libs.kotlin.test.junit)
}

tasks.withType<Test> {
    useJUnitPlatform()
}