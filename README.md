# 📱 CounterApp

A simple counter application built using **Jetpack Compose** and the **MVVM architecture**. The app demonstrates state management, unidirectional data flow, and clean separation of concerns in Android development.

---

## 🚀 Features

- Increment and decrement a counter using buttons
- Uses **ViewModel** to store UI state
- Implements **repository pattern** for data handling
- Built with **Jetpack Compose** for a modern declarative UI

---

## 🏗️ Architecture - MVVM

This app follows the **Model-View-ViewModel (MVVM)** pattern:

### 🧩 Model

Located in `CounterRepository.kt` and `CounterModel.kt`

- `CounterModel`: A simple data class holding the `count` value.
- `CounterRepository`: Manages business logic (incrementing and decrementing the counter).

### 🧠 ViewModel

Located in `CounterViewModel.kt`

- `CounterViewModel`:
    - Acts as a bridge between the UI and the data layer.
    - Holds the state (`count`) as a `MutableState<Int>`.
    - Provides methods `increment()` and `decrement()` to modify the counter and expose the updated state.

### 🎨 View

Located in `MainActivity.kt`

- `MainActivity` sets up the UI using `setContent {}`.
- Composable function `CounterApp`:
    - Displays the current count.
    - Includes buttons to increment and decrement the count.
    - Observes changes from the `ViewModel` and updates automatically via Compose recomposition.

---

## 🛠️ Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Android ViewModel**
- **State management with `mutableIntStateOf`**
- **Material 3 components**