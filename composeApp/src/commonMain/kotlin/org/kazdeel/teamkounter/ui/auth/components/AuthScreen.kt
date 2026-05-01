package org.kazdeel.teamkounter.ui.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.kazdeel.teamkounter.ui.auth.login.LoginScreen
import org.kazdeel.teamkounter.ui.auth.register.RegisterScreen

@Composable
fun AuthScreen() {

    var selectedTab by remember { mutableStateOf(0) }

    val tabs = listOf("Login", "Register")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF0F172A),
                        Color(0xFF1E293B)
                    )
                )
            )
    ) {

        Column {

            Spacer(modifier = Modifier.height(60.dp))

            TabRow(
                selectedTabIndex = selectedTab,
                containerColor = Color.Transparent,
                contentColor = Color.White
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = { Text(title) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            when (selectedTab) {
                0 -> LoginScreen()
                1 -> RegisterScreen()
            }
        }
    }
}