package pe.edu.upc.theraphytreatmentscreens20.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import pe.edu.upc.theraphytreatmentscreens20.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Treatments2(){

//    Text(text = "Find your treatment")
//    TextField(value = , onValueChange = {}){
//
//    }

    Column(modifier = Modifier.padding(12.dp)) {
        Text(text = "Find your treatment", fontWeight = FontWeight.Bold)
//        Spacer(modifier = Modifier.height(10.dp))
        Row(){
            Box(contentAlignment = Alignment.CenterEnd, modifier = Modifier
                .clip(shape = RoundedCornerShape(8.dp))
                .border(
                    BorderStroke(1.dp, Color.Magenta)
                )){
                TextField(value ="" , onValueChange = {})
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null)
                }
            }
        }
//        Spacer(modifier = Modifier.height(20.dp))
        Row() {
            Card(modifier = Modifier.padding(3.dp)) {
                //image
                Image(painter = painterResource(id = R.drawable.lumbar),
                    contentDescription = null,
                    modifier = Modifier.width(170.dp).height(170.dp).padding(3.dp)
                )
//                Spacer(modifier = Modifier.height(80.dp))
                Text(text = "Lumbar Spine", fontWeight = FontWeight.Bold)
                Text(text = "Treatment quantity: 10")
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(6.dp)) {
                    Text(text = "Info")
                }
            }
            Card(modifier = Modifier.padding(3.dp)) {
                //image
                Image(painter = painterResource(id = R.drawable.lumbar),
                    contentDescription = null,
                    modifier = Modifier.width(170.dp).height(170.dp).padding(3.dp)
                )
//                Spacer(modifier = Modifier.height(80.dp))
                Text(text = "Lumbar Spine", fontWeight = FontWeight.Bold)
                Text(text = "Treatment quantity: 10")
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(6.dp)) {
                    Text(text = "Info")
                }
            }
        }
        Row() {
            Card(modifier = Modifier.padding(3.dp)) {
                //image
                Image(painter = painterResource(id = R.drawable.lumbar),
                    contentDescription = null,
                    modifier = Modifier.width(170.dp).height(170.dp).padding(3.dp)
                )
//                Spacer(modifier = Modifier.height(80.dp))
                Text(text = "Lumbar Spine", fontWeight = FontWeight.Bold)
                Text(text = "Treatment quantity: 10")
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(6.dp)) {
                    Text(text = "Info")
                }
            }
            Card(modifier = Modifier.padding(3.dp)) {
                //image
                Image(painter = painterResource(id = R.drawable.lumbar),
                    contentDescription = null,
                    modifier = Modifier.width(170.dp).height(170.dp).padding(3.dp)
                )
//                Spacer(modifier = Modifier.height(80.dp))
                Text(text = "Lumbar Spine", fontWeight = FontWeight.Bold)
                Text(text = "Treatment quantity: 10")
                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(6.dp)) {
                    Text(text = "Info")
                }
            }
        }
//        Spacer(modifier = Modifier.height(10.dp))
        Box(contentAlignment = Alignment.BottomCenter){
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null, modifier = Modifier.border(1.dp, Color.Black, RoundedCornerShape(10.dp)))
            }
        }

//        Spacer(modifier = Modifier.height(90.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .border(3.dp, Color.Magenta),contentAlignment = Alignment.Center
        ) {
            Row(modifier = Modifier.padding(10.dp)) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = null)
                }
                Spacer(modifier = Modifier.width(30.dp))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = null)
                }
                Spacer(modifier = Modifier.width(30.dp))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = null)
                }
                Spacer(modifier = Modifier.width(30.dp))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.List, contentDescription = null)
                }
                Spacer(modifier = Modifier.width(30.dp))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = null)
                }
            }
        }
    }

}