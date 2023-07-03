package com.learning.restrant.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learning.restrant.R
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.compose.rememberNavController

@Composable
fun Order(){
    val navcontroller =rememberNavController()

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize()
    ) {
        Box{
            Box(){
                IconButton(onClick = {navcontroller.navigate("Home"){
                    popUpToRoute
                } }) {

                }
            }
            Image(
                painter = painterResource(id = R.drawable.bugar),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(300.dp)
            )
        }
        Box(
            modifier = Modifier.padding(top = 275.dp)
        ){
            Card(
                shape = RoundedCornerShape(topEnd = 50.dp, topStart = 50.dp),
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = if (isSystemInDarkTheme()) Color.Black else Color.White
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Text(
                            text = "Grilled Chicken",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                            modifier = Modifier.padding(start = 30.dp, top = 20.dp)
                        )
                        Spacer(modifier = Modifier.width(100.dp))
                        Box(
                            modifier = Modifier
                                .size(50.dp)
                                .background(Color.DarkGray, RoundedCornerShape(5.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "$35",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                                textAlign = TextAlign.Center,
                            )
                        }
                        Spacer(modifier = Modifier.width(4.dp))

                    }
                    Text(
                        text = """...lorem ipsum lama cartel goro Yeshiva have jcd
                        |name needed yardsticks dodgers houses hubcaps hdpi jogging hgd deduct hvVAX HAVING hubbub dubs which jibs lorem ipsum lama cartel goro Yeshiva name needed yardsticks dodgers houses hubcaps hdpi jogging hgd deduct hvVAX HAVING hubbub dubs which jibs
                        |""",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = if (isSystemInDarkTheme()) Color.LightGray else Color.DarkGray,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 20.dp),
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.width(300.dp),
                        colors = buttonColors(
                            backgroundColor = Color.Magenta
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Order Now",
                            tint = if (isSystemInDarkTheme()) Color.Black else Color.White
                        )
                        Text(
                            text = "Order Now",
                            fontWeight = FontWeight.SemiBold,
                            color = if (isSystemInDarkTheme()) Color.Black else Color.White
                        )

                    }
                }
            }
        }
    }
}