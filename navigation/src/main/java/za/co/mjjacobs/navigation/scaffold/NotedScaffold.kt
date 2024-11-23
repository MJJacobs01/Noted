package za.co.mjjacobs.navigation.scaffold

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*

/**
 * Created by MJ Jacobs on 2024/11/23 at 15:29
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotedScaffold(
    modifier: Modifier = Modifier,
    onActionClick: (event: ScaffoldEvent) -> Unit,
    state: ScaffoldState,
    content: @Composable (paddingValues: PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = "Noted") },
            )
        },
        content = { paddingValues ->
            content(paddingValues)
        }
    )
}