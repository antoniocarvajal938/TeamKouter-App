package org.kazdeel.teamkounter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform