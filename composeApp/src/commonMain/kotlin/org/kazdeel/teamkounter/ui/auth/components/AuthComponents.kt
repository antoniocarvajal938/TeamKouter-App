package org.kazdeel.teamkounter.ui.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun AuthTextField(
    value: String, onChange: (String) -> Unit, placeholder: String, isPassword: Boolean = false
) {
    TextField(
        value = value,
        onValueChange = onChange,
        placeholder = {
            Text(
                placeholder, color = Color.White.copy(alpha = 0.6f)
            )
        },
        visualTransformation = if (isPassword) PasswordVisualTransformation()
        else androidx.compose.ui.text.input.VisualTransformation.None,
        singleLine = true,
        textStyle = TextStyle(color = Color.White),
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
}