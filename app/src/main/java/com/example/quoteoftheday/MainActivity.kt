package com.example.quoteoftheday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.quoteoftheday.ui.theme.QuoteofthedayTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuoteofthedayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}
@Preview
@Composable

fun Quote(){
    var x by remember { mutableStateOf(0) }
    var quotearray = arrayOf( "Your the best grader for 501","No one can give my project a better grade than you","Your so amazingly epic","Hang In there-Cat Emoji", "Be a Pelican not a Peli'cant","Live is a highway and im gonna ride it","theres always tomorrow","Try your best and then you can be your best"," Your better than you were three seconds ago"," I think your amazing so be amazing","")
    var text=quotearray[x]
    Button(onClick = {
        if (x == quotearray.size - 1){
            x=0
        }
        else{
        x += 1
        }

    }) {
        Text("JuicyQuote")
    }

    Column(modifier=Modifier.fillMaxHeight().wrapContentSize(Alignment.Center),horizontalAlignment= Alignment.CenterHorizontally,){
        Text(text = quotearray[x],
        fontSize = 30.sp)
    }

}