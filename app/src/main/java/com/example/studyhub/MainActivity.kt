package com.example.studyhub
// 1. login screen - has admin, saves users to a database
// 2. Welcome screen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.studyhub.ui.theme.StudyHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            UsernameInput()
            PasswordInput()
        }

    }
}


@Composable
fun UsernameInput() {
    TextField(
        state = rememberTextFieldState(initialText = "Hello"),
        label = { Text("Username") }
    )
}

@Composable
fun PasswordInput() {
    TextField(
        state = rememberTextFieldState(initialText = "Hello"),
        label = { Text("Password") }
    )
}