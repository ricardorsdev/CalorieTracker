package com.example.tracker_data.mapper

import com.example.tracker_data.local.entity.TrackedFoodEntity
import com.example.tracker_domain.model.MealType
import com.example.tracker_domain.model.TrackedFood
import java.time.LocalDate

fun TrackedFoodEntity.toTrackedFood(): TrackedFood {
    return TrackedFood(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        amount = amount,
        mealType = MealType.fromString(type),
        date = LocalDate.of(year, month, dayOfMonth),
        calories = calories
    )
}

fun TrackedFood.toTrackedFoodEntity(): TrackedFoodEntity {
    return TrackedFoodEntity(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        type = mealType.name,
        amount = amount,
        dayOfMonth = date.dayOfMonth,
        month = date.monthValue,
        year = date.year,
        calories = calories,
        id = id
    )
}