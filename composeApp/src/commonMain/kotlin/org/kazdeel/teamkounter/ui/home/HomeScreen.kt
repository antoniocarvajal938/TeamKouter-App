package org.kazdeel.teamkounter.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()) {
    Box {
        NavHost(navController = navController, startDestination = "home") {}
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}