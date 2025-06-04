 package com.example.myapplication

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            AppCounter();


        }
    }
}


 @Composable
 fun AppCounter(){
     var count by remember { mutableStateOf(value = 0) }

     Column (modifier = Modifier.fillMaxWidth()
         .fillMaxHeight(),
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Center
         ){
         Text("Value is:${count}", fontSize = 30.sp);
         Button(onClick = {
             count++;
         }) {
             Text(text = "Increment++")
         }
     }
 }


 @Composable
 fun BoxExamole(modifier: Modifier=Modifier){

    return Box(modifier = Modifier
         .background(color = Color.Cyan)
         .fillMaxHeight()
         .fillMaxWidth()){
         Box(modifier = Modifier
             .height(400.dp)
             .width(200.dp)
             .background(color = Color.White)
             .align(Alignment.BottomEnd))

         Box(modifier = Modifier
             .height(600.dp)
             .width(300.dp)
             .background(color = Color.Yellow)
             .align(Alignment.Center));

         Box(modifier = Modifier
             .height(500.dp)
             .width(200.dp)
             .background(color = Color.Red));

     }

 }


 @Composable
 fun BoxExmaple(){

     Box (contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth().fillMaxHeight()){

         Card (modifier = Modifier
             .height(500.dp)
             .width(300.dp)
             .background(color = Color.White),
             shape = RoundedCornerShape(20.dp)
             , elevation = CardDefaults.cardElevation(20.dp), colors = CardColors(containerColor = Color.Unspecified, contentColor = Color.Unspecified, disabledContainerColor = Color.Unspecified, disabledContentColor = Color.Unspecified)
         ){

             Spacer(modifier = Modifier.height(40.dp))

             Image(painter = painterResource(id = R.drawable.img),
                 contentDescription = "Profile"
                 , modifier = Modifier.fillMaxWidth()
                     .fillMaxWidth())
         }

     }
 }
