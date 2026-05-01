package org.kazdeel.teamkounter.ui.auth.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.kazdeel.teamkounter.ui.auth.components.ParticlesBackground
import org.kazdeel.teamkounter.ui.auth.components.AuthTextField

@Composable
fun RegisterScreen() {

    var name by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        ParticlesBackground()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // HEADER
            Text(
                text = "Crea tu cuenta",
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Empieza a dominar tus estadísticas.",
                color = Color(0xFF94A3B8),
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(28.dp))

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

                // NAME
                AuthTextField(name, { name = it }, "Nombre")

                Spacer(modifier = Modifier.height(12.dp))

                // LASTNAME
                AuthTextField(lastname, { lastname = it }, "Apellido")

                Spacer(modifier = Modifier.height(12.dp))

                // EMAIL
                AuthTextField(email, { email = it }, "Email")

                Spacer(modifier = Modifier.height(12.dp))

                // PASSWORD
                AuthTextField(password, { password = it }, "Password", isPassword = true)

                Spacer(modifier = Modifier.height(20.dp))

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
                        text = "Crear cuenta",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "¿Ya tienes cuenta? Inicia sesión",
                color = Color(0xFF6366F1),
                fontSize = 12.sp
            )
        }
    }
}