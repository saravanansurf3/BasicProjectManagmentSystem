package com.sara.waie.myuideclarativebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sara.waie.myuideclarativebasic.ui.theme.MyUiDeclarativeBasicTheme
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting1("Saravana")
        }
    }
}

fun test(){
    MainScope().launch() {

    }
}

@Composable
fun Greeting1(name: String) {
    Text(text = "Hello $name!",modifier = Modifier.fillMaxHeight())
}
@Composable
fun myTextView(){
    Text(text = buildString {

    })

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyUiDeclarativeBasicTheme {
        Column{
            Greeting1("Ohhooo")

        }

    }
}