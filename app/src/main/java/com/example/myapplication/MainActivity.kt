 package com.example.myapplication

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

           Column  (
               modifier = Modifier.background(color = Color.Yellow)
                   .fillMaxHeight()
                   .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.End,

           ){

               Text(text = "Flutter esay esay Tamam Tamam", color = Color.Red);
               Text(text = "Hi Android im Comming", color = Color.Yellow);
               SayMyName(name="Hiiiiiiiiii");
               Text(text = "Hi Android im Comming", color = Color.Red);
               Text(text = "Hi Android im Comming", color = Color.Gray, letterSpacing = TextUnit.Unspecified)
               Text(text = "Hi Android im Comming", color = Color.LightGray, fontSize = 20.sp);
               Button(onClick = { println("Click Hear") }) { Text("جووون") }

           }
        }
    }
}


 @Composable
 fun SayMyName(name:String){

     Text(text = name)
 }