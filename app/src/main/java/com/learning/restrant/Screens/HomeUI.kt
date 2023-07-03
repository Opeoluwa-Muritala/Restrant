package com.learning.restrant.Screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.learning.restrant.Data.FoodItems
import com.learning.restrant.Navigation.bottombar
import com.learning.restrant.R

@Composable
fun Home(){
    var search by remember {
        mutableStateOf("")
    }
val navController = rememberNavController()

Scaffold(
            topBar = {
                topappbar()
            },
            backgroundColor = if (isSystemInDarkTheme()) Color.DarkGray else Color.LightGray,
            bottomBar = {
                 bottombar()
            }
        ) {

        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {


            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                label = {
                    Text(text = "Search Food")
                },
                leadingIcon = {
                    Icon(Icons.Default.Search, null)
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp)
            )

            listitems()
            foodItems()
            Offersanddiscount()

        }

    }
}

@Composable
fun topappbar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .height(40.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically


    ){
        Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Card(
                shape = RoundedCornerShape(3.dp),
                backgroundColor = if (isSystemInDarkTheme()) Color.Red else Color.Magenta,
                contentColor = Color.White,
                modifier = Modifier.size(20.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_restaurant_24),
                    contentDescription = null,
                    modifier = Modifier.size(10.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "Chow",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
        Icon(imageVector = Icons.Default.Close, contentDescription = "Logout")
    }
}

@Composable
fun listitems(){

    var scrollsection = listOf<String>(
        "Combo Meal", "Chicken", "Drinks", "Snacks", "Vegetables"
    )
        val focusRequester = remember { FocusRequester() }
        var focus by remember {
            mutableStateOf(false)
        }
     LazyRow(

        ) {
            items(scrollsection) { text ->
                Text(
                    text = text,
                    textDecoration = if (focus) TextDecoration.None else TextDecoration.Underline,
                    modifier = Modifier
                        .focusRequester(focusRequester)
                        .onFocusChanged { focus = true }
                        .clickable {

                        }
                        .padding(10.dp, 20.dp, 20.dp, 10.dp),
                    fontSize = 15.sp,
                    fontWeight = if (focus) FontWeight.Bold else FontWeight.Light,
                    color = if (focus) Color.White else Color.LightGray,

                )
            }
        }
}

@Composable
fun foodItems(
){
    val navcontroller = rememberNavController()
    var foodItems =
                listOf(
                    FoodItems(
                        food = "Milkshake",
                        image = R.drawable.milkshake,
                        cost = "10"
                    ),

                    FoodItems(
                        "Grilled Chicken",
                        R.drawable.chicken,
                        "35"
                    ),

                    FoodItems(
                        "Turkey",
                        R.drawable.turky,
                        "40"
                    ),
                    FoodItems(
                        "Spaghetti",
                        R.drawable.spag,
                        "20"
                    ),
                    FoodItems(
                        "Macaroni",
                        R.drawable.macaroni,
                        "25"
                    ),
                    FoodItems(
                        "Burger",
                        R.drawable.bugar,
                        "15"
                    )
                )

    LazyRow{
        items(foodItems){ foodItems ->
            Card(
                shape = RoundedCornerShape(15.dp),
                backgroundColor = if (isSystemInDarkTheme()) Color.LightGray else Color.White,
                modifier = Modifier
                    .size(width = 200.dp, height = 300.dp)
                    .clickable {

                        navcontroller.navigate("Order")
                    }
                    .padding(10.dp),
                elevation = 20.dp
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(top = 50.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Image(
                        painter = painterResource(id = foodItems.image),
                        contentDescription = foodItems.food,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(RoundedCornerShape(50)),
                        contentScale = ContentScale.FillBounds
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = foodItems.food,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "\$${foodItems.cost}",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Composable
fun Offersanddiscount(){
    Column(Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Offers & Discount")
        Box(
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(25.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.chik),
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(25.dp))
                    .fillMaxWidth()
                    .height(300.dp),
                alpha = 0.2F
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {


                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_restaurant_24),
                    contentDescription = "Logo",
                    modifier = Modifier.size(100.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(text = "Get Discount of",fontWeight = FontWeight.Normal, fontSize = 20.sp)
                    Text(text = "30%", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                    Text(text = "on your first order and instant cashback",fontWeight = FontWeight.Normal, fontSize = 20.sp)
                }
                
            }
        }
    }
}

