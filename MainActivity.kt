package com.gialinh.listapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


// Create MainActivity as the starting point of the program
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Create setContent to call Composable AppContent and display the UI array
        setContent {
            AppContent() //The main UI layout has been defined and attached to the AppContent.kt file.
        }
    }
}