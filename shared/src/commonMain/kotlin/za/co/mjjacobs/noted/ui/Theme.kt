package za.co.mjjacobs.noted.ui

import androidx.compose.foundation.*
import androidx.compose.material3.*
import androidx.compose.runtime.*

/**
 * Created by MJ Jacobs on 2024/11/23 at 15:41
 */

@Composable
fun NotedTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) {
            darkColorScheme
        } else {
            lightColorScheme
        },
        content = {
            content()
        }
    )
}

val lightColorScheme = lightColorScheme()

val darkColorScheme = darkColorScheme()