package com.learning.restrant.Data

import androidx.annotation.DrawableRes

data class FoodItems(
    val food: String,
    @DrawableRes val image:Int,
    val cost: String
)
