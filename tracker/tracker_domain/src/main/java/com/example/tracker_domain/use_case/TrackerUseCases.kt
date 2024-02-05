package com.example.tracker_domain.use_case

data class TrackerUseCases(
    val calculateMealNutrients: CalculateMealNutrients,
    val deleteTrackedFood: DeleteTrackedFood,
    val getFoodsForDate: GetFoodsForDate,
    val searchFood: SearchFood,
    val trackFood: TrackFood,
)
