package com.example.onboarding_presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.core_ui.LocalSpacing

@Composable
fun SelectableButton(
    text: String,
    isSelected: Boolean,
    color: Color,
    selectedTextColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.button,
) {
    Box(modifier = modifier
        .background(
            color = if (isSelected) color else Color.Transparent, shape = RoundedCornerShape(100.dp)
        )
        .clip(RoundedCornerShape(100.dp))
        .border(
            width = 2.dp, color = color, shape = RoundedCornerShape(100.dp)
        )
        .clickable { onClick() }
        .padding(LocalSpacing.current.spaceMedium),
        contentAlignment = Alignment.Center) {
        Text(
            text = text,
            color = if (isSelected) selectedTextColor else MaterialTheme.colors.primaryVariant,
            style = textStyle
        )
    }
}