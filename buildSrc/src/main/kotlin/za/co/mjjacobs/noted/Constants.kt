package za.co.mjjacobs.noted

import org.gradle.api.*

object Constants {
    //  Name spaces
    val androidAppNameSpace = "za.co.mjjacobs.noted"
    val sharedNameSpace = "za.co.mjjacobs.noted.shared"
    val databaseNameSpace = "za.co.mjjacobs.noted.database"
    val navigationNamespace = "za.co.mjjacobs.noted.navigation"
    val noteNamespace = "za.co.mjjacobs.noted.note"
    
    //  Versions
    const val androidVersionCode = 1
    const val androidVersionName = "1.0.0"  //  Major.Minor.Patch
    const val serverVersionName = "1.0.0"   //  Major.Minor.Patch
    
    //  Java version
    val javaVersion = JavaVersion.VERSION_11
    val jvmTarget = javaVersion.toString()
}