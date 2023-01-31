package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name : Int,
    val numCourses : Int,
    @DrawableRes val image : Int
)
