package com.gialinh.listapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment


@Composable // Create the main Composable to display the application's content on the screen
fun AppContent() {
    Column( // Column tab to arrange Composables vertically
        modifier = Modifier
            .fillMaxSize()
            .background( // Create a gradient background for the screen
                brush = Brush.verticalGradient(
                    colors = listOf( // Create a list of mixed colors
                        Color(0xFFFFC0CB),
                        Color(0xFFB39DDB),
                        Color(0xFF90CAF9)
                    )
                )
            )
            .padding(16.dp), // Create padding around the column
        horizontalAlignment = Alignment.CenterHorizontally // Align and center the Composables horizontally
    ) {
        // Welcome Message
        Text(
            text = "Hello Friend , Welcome to my Beauty App",
            fontSize = 24.sp,
            color = Color.Black,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp)) // Create a vertical distance of 16dp

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB39DDB)),
            modifier = Modifier.fillMaxWidth()
        ) {
            // Create an Add Item button
            Text("Add Item in your basket", color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp)) // 16dp distance before the list
        // Call the Composable BeautyList function to display the list of products on the screen.
        BeautyList(
            items = listOf( // List of products
                "Oil lip",
                "Mascara",
                "Setting Spray",
                "Eye Palette",
                "Highlight Stick",
                "Eye Liner",
                "Makeup Remover",
                "Nail Polish"
            )
        )
    }
}
// Create a Preview to preview your shopping list in Android Studio.
@Preview(showBackground = true)
@Composable
fun AppContentPreview() = AppContent()