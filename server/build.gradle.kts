import za.co.mjjacobs.noted.*

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
    application
}

group = Constants.androidAppNameSpace
version = Constants.serverVersionName
application {
    mainClass.set("za.co.mjjacobs.noted.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")
}

dependencies {
    //  Shared modules
    implementation(projects.shared)
    
    implementation(libs.logback)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    
    //  Tests
//    testImplementation(libs.ktor.server.tests)
    testImplementation(libs.kotlin.test.junit)
}