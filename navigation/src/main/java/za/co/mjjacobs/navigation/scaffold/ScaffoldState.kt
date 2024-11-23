package za.co.mjjacobs.navigation.scaffold

data class ScaffoldState(
    val titleText: String = "Noted",
    val isSearching: Boolean = false,
    val searchText: String = ""
)
