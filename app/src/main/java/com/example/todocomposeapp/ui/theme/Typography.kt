package com.example.todocomposeapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.todocomposeapp.R

val AppFont = FontFamily(Font(R.font.roboto_regular), Font(R.font.roboto_medium, FontWeight.Medium))

val AppTypography = Typography(
    displayLarge = TextStyle(fontFamily = AppFont, fontWeight = FontWeight.ExtraBold, fontSize = 36.sp), // Slightly larger & bolder
    titleLarge = TextStyle(fontFamily = AppFont, fontWeight = FontWeight.SemiBold, fontSize = 25.sp), // Semi-bold for distinction
    titleMedium = TextStyle(fontFamily = AppFont, fontWeight = FontWeight.Medium, fontSize = 21.sp), // Slightly increased
    bodyLarge = TextStyle(fontFamily = AppFont, fontWeight = FontWeight.Light, fontSize = 17.sp), // Light weight for modern touch
    labelSmall = TextStyle(fontFamily = AppFont, fontWeight = FontWeight.Bold, fontSize = 12.sp) // Slightly larger label text
)