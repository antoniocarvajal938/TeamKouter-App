package org.kazdeel.teamkounter.ui.auth.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

data class Particle(
    val xRatio: Float, val yRatio: Float, val radius: Float, val speed: Float, val color: Color
)

@Composable
fun ParticlesBackground() {

    // 👉 partículas en formato relativo (0-1)
    val particles = remember {
        List(50) {
            Particle(
                xRatio = Random.nextFloat(),
                yRatio = Random.nextFloat(),
                radius = Random.nextFloat() * 6f + 2f,
                speed = Random.nextFloat() * 100f + 40f,
                color = listOf(
                    Color(0xFF8B5CF6), Color(0xFF6366F1), Color(0xFF22D3EE)
                ).random()
            )
        }
    }

    val infiniteTransition = rememberInfiniteTransition()

    val animationProgress by infiniteTransition.animateFloat(
        initialValue = 0f, targetValue = 1f, animationSpec = infiniteRepeatable(
            animation = tween(6000, easing = LinearEasing)
        )
    )

    Canvas(modifier = Modifier.fillMaxSize()) {

        particles.forEach { particle ->

            val x = particle.xRatio * size.width
            val baseY = particle.yRatio * size.height

            val newY = (baseY + animationProgress * particle.speed) % size.height

            // Glow
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        particle.color.copy(alpha = 0.35f), Color.Transparent
                    )
                ), radius = particle.radius * 4, center = Offset(x, newY)
            )

            // Core
            drawCircle(
                color = particle.color, radius = particle.radius, center = Offset(x, newY)
            )
        }
    }
}