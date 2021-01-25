package com.todox.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import com.todox.android.ui.theme.TODOXTheme
import androidx.compose.material.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TODOXTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Rohit Jakhar Code 1")
                }
            }
        }
    }
}

@Composable
fun Greeting(
        name: String
) {
    Text(text = "Hello $name!")
}

@Preview(
        showBackground = true
)
@Composable
fun DefaultPreview() {
    TODOXTheme {
        Greeting("Android")
    }
}