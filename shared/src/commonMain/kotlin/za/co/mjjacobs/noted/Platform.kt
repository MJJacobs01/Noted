package za.co.mjjacobs.noted

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform