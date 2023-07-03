package com.learning.restrant.Screens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.TextFieldDefaults.textFieldColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.Lock
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material.icons.twotone.Phone
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learning.restrant.R
import kotlinx.coroutines.delay

@Composable
fun SignUp() {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
    Card(
        backgroundColor = Color.DarkGray,
        shape = RoundedCornerShape(bottomEnd = 400.dp, bottomStart = 400.dp),
        elevation = 20.dp,
        contentColor = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                shape = CircleShape,
                backgroundColor = if (isSystemInDarkTheme()) Color.Red else Color.Magenta,
                contentColor = Color.White,
                modifier = Modifier.size(50.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_restaurant_24),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
            }
            Text(
                text = "Chow",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold
            )

        }
    }
    Column(
        modifier = Modifier
            .padding(start = 20.dp, top = 20.dp, end = 20.dp)
            .fillMaxSize(),
    ) {
        TextField(
            value = username,
            onValueChange = { username = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.TwoTone.Person,
                    contentDescription = null,
                    tint = Color.LightGray
                )
            },
            shape = RoundedCornerShape(30.dp),
            maxLines = 1,
            singleLine = true,
            colors = textFieldColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.White else Color.LightGray,
                textColor = if (isSystemInDarkTheme()) Color.Black else Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "Username",
                    color = if (isSystemInDarkTheme()) Color.Black else Color.White
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = username,
            onValueChange = { username = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.TwoTone.Phone,
                    contentDescription = null,
                    tint = Color.LightGray
                )
            },
            shape = RoundedCornerShape(30.dp),
            maxLines = 1,
            singleLine = true,
            colors = textFieldColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.White else Color.LightGray,
                textColor = if (isSystemInDarkTheme()) Color.Black else Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "Phone Number",
                    color = if (isSystemInDarkTheme()) Color.Black else Color.White
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = username,
            onValueChange = { username = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.TwoTone.Email,
                    contentDescription = null,
                    tint = Color.LightGray
                )
            },
            shape = RoundedCornerShape(30.dp),
            maxLines = 1,
            singleLine = true,
            colors = textFieldColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.White else Color.LightGray,
                textColor = if (isSystemInDarkTheme()) Color.Black else Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "Email",
                    color = if (isSystemInDarkTheme()) Color.Black else Color.White
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = username,
            onValueChange = { username = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.TwoTone.Lock,
                    contentDescription = null,
                    tint = Color.LightGray
                )
            },
            shape = RoundedCornerShape(30.dp),
            maxLines = 1,
            singleLine = true,
            colors = textFieldColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.White else Color.LightGray,
                textColor = if (isSystemInDarkTheme()) Color.Black else Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "Password",
                    color = if (isSystemInDarkTheme()) Color.Black else Color.White
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Spacer(modifier = Modifier.height(20.dp))


        TextField(
            value = username,
            onValueChange = { username = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.TwoTone.Lock,
                    contentDescription = null,
                    tint = Color.LightGray
                )
            },
            shape = RoundedCornerShape(30.dp),
            maxLines = 1,
            singleLine = true,
            colors = textFieldColors(
                backgroundColor = if (isSystemInDarkTheme()) Color.White else Color.LightGray,
                textColor = if (isSystemInDarkTheme()) Color.Black else Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "Confirm Password",
                    color = if (isSystemInDarkTheme()) Color.Black else Color.White
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Spacer(modifier = Modifier.height(20.dp))


        var loading = remember {
            mutableStateOf(false)
        }
        if (loading.value) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
            CircularProgressIndicator(
                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                strokeWidth = 10.dp
            )
        }
        } else {
            Button(
                onClick = { loading.value = true },
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    backgroundColor = Color.Red,
                ),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Sign Up")
            }
        }
        LaunchedEffect(key1 = Unit,) {
            delay(5000)
            loading.value = false
        }
    }
    Spacer(modifier = Modifier.height(20.dp))
    Row(horizontalArrangement = Arrangement.Center) {
        Text(
            text = "Don't have an Account?",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Medium,
            color = if (isSystemInDarkTheme()) Color.White else Color.Black,
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "Sign Up",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Medium,
            color = Color.Cyan,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
    }
    }
}