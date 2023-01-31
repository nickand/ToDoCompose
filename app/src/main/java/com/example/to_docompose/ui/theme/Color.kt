package com.example.to_docompose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFF000000)
val Purple500 = Color(0x29000000)
val Purple700 = Color(0xFF000000)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0XFFFF4646)
val NonePriorityColor = MediumGray

val Colors.fabBackgroundColor: Color
@Composable
get() = if (isLight) Color.Black else MediumGray

val Colors.topAppBarContentColor: Color
@Composable
get() = if (isLight) Color.Black else Color.White

val Colors.topAppBarBackgroundColor: Color
@Composable
get() = if (isLight) MediumGray else DarkGray

val Colors.taskItemBackgroundColor: Color
@Composable
get() = if (isLight) LightGray else DarkGray

val Colors.taskItemTextColor: Color
@Composable
get() = if (isLight) Color.Blue else DarkGray

val Colors.splashScreenBackground: Color
@Composable
get() = if (isLight) DarkGray else LightGray