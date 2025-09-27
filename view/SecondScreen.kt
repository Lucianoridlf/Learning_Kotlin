package com.example.app.view
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController


@Composable
fun secondScreen(navController : NavController) {
    Button(
        onClick = {navController.popBackStack()},
        colors = ButtonDefaults.buttonColors(
            Color.Red,
            Color.White
        )
    ) {
        Text("Devuélveme")
    }
}

navController.popBackStack()
