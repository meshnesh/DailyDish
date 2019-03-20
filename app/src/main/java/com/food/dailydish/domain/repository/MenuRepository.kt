package com.food.dailydish.domain.repository

import com.food.dailydish.domain.model.FoodMenu
import com.food.dailydish.domain.model.MealType

class MenuRepository: IRepository {
    override fun addFoodMenu(menu: FoodMenu) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteFoodMenu(menu: FoodMenu) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllMenus(): List<FoodMenu> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFoodByMealType(mealType: MealType): List<FoodMenu> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteByMealType(mealType: MealType): List<FoodMenu> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOneMenu(menuId: String): FoodMenu {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateMenu(menuId: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}