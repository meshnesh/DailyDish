package com.food.dailydish.domain.model

data class FoodMenu (val name: String, val id: String, var image: String, var ingredients: String, val mealType: MealType)

enum class MealType {
    PROTEIN, FAT_AND_OIL, CARBOHYDRATE, VITAMINS, VEGETABLES, DRINKS
}