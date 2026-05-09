package org.kazdeel.teamkounter

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.kazdeel.teamkounter.ui.auth.AuthScreen

@Composable
fun App() {
    MaterialTheme {
        AuthScreen()
    }
}