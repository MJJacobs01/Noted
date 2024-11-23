package za.co.mjjacobs.navigation.scaffold

import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.*

/**
 * Created by MJ Jacobs on 2024/11/23 at 15:35
 */

@Composable
fun NotedTopAppBar(
    modifier: Modifier = Modifier,
    state: ScaffoldState,
    onActionClick: (event: ScaffoldEvent) -> Unit
) {
    if (state.isSearching) {
        //  Searching
        IsSearchingTopBar(
            modifier = modifier,
            state = state,
            onActionClick = onActionClick
        )
    } else {
        //  Not searching
        NotSearchingTopAppBar(
            modifier = modifier,
            onActionClick = onActionClick
        )
    }
}

@Composable
private fun IsSearchingTopBar(
    modifier: Modifier = Modifier,
    state: ScaffoldState,
    onActionClick: (event: ScaffoldEvent) -> Unit
) {
}

@Composable
private fun NotSearchingTopAppBar(
    modifier: Modifier = Modifier,
    onActionClick: (event: ScaffoldEvent) -> Unit
) {
}

@Preview
@Composable
private fun PreviewNotedTopAppBarSearchingLight() {

}