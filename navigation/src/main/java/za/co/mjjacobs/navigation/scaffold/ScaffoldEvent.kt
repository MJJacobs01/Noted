package za.co.mjjacobs.navigation.scaffold

/**
 * Created by MJ Jacobs on 2024/11/23 at 15:30
 */

interface ScaffoldEvent {
    object OnSearchClicked : ScaffoldEvent
    data class OnSearchTextChange(val searchText: String) : ScaffoldEvent
    data object OnSearchCloseClicked : ScaffoldEvent
}