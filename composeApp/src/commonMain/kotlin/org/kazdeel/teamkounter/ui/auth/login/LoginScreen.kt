package org.kazdeel.teamkounter.ui.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.kazdeel.teamkounter.ui.auth.components.ParticlesBackground


@Composable
fun LoginScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        ParticlesBackground()

        // CONTENT
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // HEADER
            Text(
                text = "TeamKounter",
                fontSize = 42.sp,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 1.5.sp,
                style = LocalTextStyle.current.copy(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF6366F1), // azul
                            Color(0xFF8B5CF6), // morado
                            Color(0xFF22D3EE)  // cyan
                        )
                    )
                ),
                modifier = Modifier
                    .shadow(8.dp, shape = RoundedCornerShape(8.dp))
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Control total del juego.",
                color = Color(0xFF94A3B8),
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(32.dp))

            // CARD
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(20.dp, RoundedCornerShape(24.dp))
                    .background(
                        color = Color(0xFF1E293B).copy(alpha = 0.95f),
                        shape = RoundedCornerShape(24.dp)
                    )
                    .padding(20.dp)
            ) {

                TextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = {
                        Text(
                            "Email",
                            color = Color.White.copy(alpha = 0.6f) //PLACEHOLDER
                        )
                    },
                    singleLine = true,
                    textStyle = androidx.compose.ui.text.TextStyle(
                        color = Color.White
                    ),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color(0xFF0F172A),
                        focusedContainerColor = Color(0xFF0F172A),

                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,

                        cursorColor = Color.White
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                TextField(
                    value = password,
                    onValueChange = { password = it },
                    placeholder = {
                        Text(
                            "Password",
                            color = Color.White.copy(alpha = 0.6f)
                        )
                    },
                    visualTransformation = PasswordVisualTransformation(),
                    singleLine = true,
                    textStyle = androidx.compose.ui.text.TextStyle(
                        color = Color.White
                    ),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color(0xFF0F172A),
                        focusedContainerColor = Color(0xFF0F172A),

                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,

                        cursorColor = Color.White
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(24.dp))

                // BUTTON
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                        .shadow(10.dp, RoundedCornerShape(14.dp))
                        .background(
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xFF6366F1),
                                    Color(0xFF8B5CF6)
                                )
                            ),
                            shape = RoundedCornerShape(14.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Entrar",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "¿Olvidaste tu contraseña?",
                color = Color(0xFF6366F1),
                fontSize = 12.sp
            )
        }
    }
}