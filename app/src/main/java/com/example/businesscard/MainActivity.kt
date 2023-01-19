package com.example.businesscard

import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {Greeting("Auqid Irfan", "Android Developer")
                    address(number = "+91 8899276500","@g.com/auqid","auqidirfan100@gmail.com")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,occupation:String) {

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {val image = painterResource(id = R.drawable.android_logo)
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp),


        )
        Text(text = name,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
        Text(text= occupation,
        color = androidx.compose.ui.graphics.Color.Green)

    }
}
@Composable
fun address(number:String,id:String,mail:String) {
    Column(verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),




        ) {
        Row(){
            Icon(Icons.Rounded.Phone, contentDescription = null,
            )
            Text(text = number,
            modifier=Modifier.padding(start = 16.dp)
            )
        }
        Row() {
            Icon(Icons.Rounded.Share, contentDescription = null,
                )
            Text(text = id
                //modifier=Modifier.padding(start = 16.dp)
         )
        }
        Row() {
            Icon(Icons.Rounded.MailOutline, contentDescription = null,
                )
            Text(text = mail,
            modifier = Modifier.padding(bottom = 26.dp))
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Greeting("janedoe", "developer")
        address(number = "+91 8899276500","@android.dev/yoyo","yooyoy100@gmail.com")
    }
}