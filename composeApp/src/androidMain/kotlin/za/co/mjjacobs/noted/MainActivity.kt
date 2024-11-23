package za.co.mjjacobs.noted

import android.os.*
import androidx.activity.*
import androidx.activity.compose.*
import dagger.hilt.android.AndroidEntryPoint
import za.co.mjjacobs.noted.ui.*

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotedTheme {
            
            }
        }
    }
}