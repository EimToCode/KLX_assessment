package com.eimycb.ui.component

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun TextNameField() {
    var text by remember { mutableStateOf("Enter your name...") }
    OutlinedTextField(
        value = text,
        onValueChange = { newText -> text = newText },
        label = { Text(text = "Name") },
        singleLine = true
    )
}