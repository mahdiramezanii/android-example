package com.example.myapplication
import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  MainScreen(modifier: Modifier = Modifier) {

    var username by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }
    var userId by remember { mutableStateOf(value = "") }

    Scaffold (modifier= Modifier.background(color = Color.Red) ,topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White
        ), title = {

            Text("Register Screen")
        })
    }){
            padding ->
        Column (modifier = Modifier
            .padding(padding)
            .fillMaxSize()
            .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

          TextField(modifier = Modifier.fillMaxWidth(),
              value = username,
              label = { Text(text = "Username") },
              onValueChange = { userNameInput ->
              username=userNameInput;
          });
          Spacer(modifier=Modifier.height(10.dp));

            TextField(modifier=Modifier.fillMaxWidth(), label = { Text(text = "Password") },value = password, onValueChange = {
                password =it;
            })

            Spacer(modifier=Modifier.height(10.dp));

            TextField(modifier=Modifier.fillMaxWidth(), label = { Text("User Id") }, value = userId, onValueChange = {
                userId=it;
            })
            Spacer(modifier=Modifier.height(10.dp));

            Button (modifier =
            Modifier.fillMaxWidth()
                .height(45.dp),
                shape = RoundedCornerShape(10.dp
            ), onClick = {

            } ) {
                Text("Register")
            }

        }

    }

}

fun TextField(modifier: Modifier, value: String, label: Unit, onValueChange: () -> Unit) {

}

fun TextField(value: String) {

}
