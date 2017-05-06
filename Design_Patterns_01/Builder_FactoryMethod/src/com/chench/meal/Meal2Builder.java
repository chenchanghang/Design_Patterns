package com.chench.meal;

import com.chench.drink.Drink2Factory;
import com.chench.drink.DrinkFactory;
import com.chench.food.Food2Factory;
import com.chench.food.FoodFactory;

public class Meal2Builder extends MealBuilder
{
	/* 套餐1：
	 * 一个鸡腿堡
	 * 一杯可乐
	 */

	@Override
	public void buildFood() {
		FoodFactory foodFactory = new Food2Factory();
		meal.setFood(foodFactory.createFood());	
	}

	@Override
	public void buildDrink() {
		DrinkFactory drinkFactory = new Drink2Factory();
	    meal.setDrink(drinkFactory.createDrink());
		
	}
	
	
}