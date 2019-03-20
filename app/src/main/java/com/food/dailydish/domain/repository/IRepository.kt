package com.food.dailydish.domain.repository

import com.food.dailydish.domain.model.FoodMenu
import com.food.dailydish.domain.model.MealType

interface IRepository {
    fun addFoodMenu(menu: FoodMenu)
    fun deleteFoodMenu(menu: FoodMenu)
    fun getAllMenus(): List<FoodMenu>
    fun getFoodByMealType(mealType: MealType): List<FoodMenu>
    fun deleteByMealType(mealType: MealType): List<FoodMenu>
    fun getOneMenu(menuId: String): FoodMenu
    fun updateMenu(menuId: String)
}