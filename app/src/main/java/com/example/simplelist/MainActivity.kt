package com.example.simplelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simplelist.ui.theme.SimpleListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleListTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        ListExample()
                    }
                }
            }
        }
    }
}

@Composable
fun ListExample() {
    val listA = listOf<String>("Amsterdam", "Bangkok", "Bengaluru", "Berlin", "Budapest", "Copenhagen", "Dubai", "Dublin", "Gran Canaria", "Sydney")
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(20.dp)
    ) {
        items(listA) { item ->
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleListTheme {
        ListExample()
    }
}