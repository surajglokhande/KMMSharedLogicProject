package com.suraj.kmmsharedlogicproject.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.suraj.kmmsharedlogicproject.GetPlatformClass
import com.suraj.kmmsharedlogicproject.Greeting
import com.suraj.kmmsharedlogicproject.getPlatformFun
import com.suraj.kmmsharedlogicproject.getPlatformVar
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column() {
                        GreetingView("Hello, Android!")
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Box(
        modifier = Modifier
//            .width(375.dp)
//            .height(70.dp)
            //.background(Color(0xFF0051A2))
            .padding(vertical = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFF0051A2), RoundedCornerShape(4.dp))
                    .padding(horizontal = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                TextField(
                    value = TextFieldValue(text),
                    onValueChange = {
                        println(it.text)
                    },
                    modifier = Modifier
                        .weight(5f)
                        .height(45.dp),
                    singleLine = true,
                    interactionSource = remember { MutableInteractionSource() },
                    colors = androidx.compose.material3.TextFieldDefaults.colors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black
                    ),
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 14.sp,
                        lineHeight = 20.sp
                    )
                )
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    tint = Color.White,
                    modifier = Modifier
                        .weight(1f)
                        .size(24.dp)
                )
            }
            Column(modifier = Modifier
                .padding(5.dp)
            ) {
                //variable
                Text(Greeting().greetVar())
                Text(getPlatformVar.name)
                //fun
                Text(Greeting().greetFun())
                Text(getPlatformFun().name)
                //class
                Text(Greeting().greetClass())
                Text(GetPlatformClass().name)
            }
        }

    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
