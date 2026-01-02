# TeamKounter

TeamKounter is a cross-platform mobile application for Android and iOS built with Kotlin Multiplatform and Jetpack Compose. This repository contains the shared codebase and platform-specific implementations.

## Overview

This project serves as a foundational template for building mobile applications that share UI and logic across Android and iOS. The current implementation features a simple user interface with a single screen that demonstrates:
- A shared UI built with Jetpack Compose.
- A button to toggle the visibility of content with an animation.
- Platform-specific logic to display the operating system's name and version.
- A basic navigation setup using `navigation-compose` to handle different screens within the app.

## Tech Stack & Libraries

- **Kotlin Multiplatform:** For writing shared business logic across different platforms.
- **Jetpack Compose Multiplatform:** For creating a shared, declarative UI for both Android and iOS.
- **Material 3:** The UI components are based on the Material Design 3 guidelines.
- **Compose Navigation:** For handling navigation between different composable screens.
- **Lifecycle ViewModel Compose:** For managing UI-related data in a lifecycle-conscious way.
- **Gradle (with Version Catalog):** For build automation and dependency management.

## Project Structure

The repository is structured as a standard Kotlin Multiplatform project:

- **`/composeApp`**: This is the shared module containing code for both Android and iOS.
    - `src/commonMain/kotlin`: Contains platform-agnostic code, including shared UI (Jetpack Compose), business logic, and navigation setup.
    - `src/androidMain/kotlin`: Android-specific implementations, such as the `MainActivity` and platform-specific `getPlatform()` function.
    - `src/iosMain/kotlin`: iOS-specific implementations, including the `MainViewController` and the iOS `getPlatform()` function.

- **`/iosApp`**: Contains the Xcode project required to build and run the application on iOS devices and simulators. It includes the SwiftUI `ContentView` that hosts the shared Compose UI.
