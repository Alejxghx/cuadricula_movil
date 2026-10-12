package com.alejxghx.cuadricula.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val coursesCount: Int,
    @DrawableRes val imageRes: Int
)
