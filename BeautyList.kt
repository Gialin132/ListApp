package com.gialinh.listapp

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable // The main Composable tab is used to display a list of beauty products for the user.
fun BeautyList(items: List<String>) { // Create a String to get a list of beauty products
    LazyColumn {
        items(items) { item -> // Iterate through each item in the list
            Text(
                text = item, // Display product name on screen
                modifier = Modifier.padding(8.dp) // Decorative padding around text
            )
        }
    }
}
// Create a Preview to preview your shopping list in Android Studio.
@Preview(showBackground = true) // The `showBackground = true` tag allows the preview background to change color based on user input.
@Composable
fun BeautyListPreview() {
    BeautyList(
        items = listOf( // Create a sample shopping list for preview on the screen
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