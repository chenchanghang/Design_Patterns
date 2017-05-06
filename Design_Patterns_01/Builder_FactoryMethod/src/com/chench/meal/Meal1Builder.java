package com.chench.meal;

import com.chench.drink.Drink1Factory;
import com.chench.drink.DrinkFactory;
import com.chench.food.Food1Factory;
import com.chench.food.FoodFactory;

public class Meal1Builder extends MealBuilder
{
	/* 套餐1：
	 * 一个鸡蛋卷
	 * 一杯果汁
	 */
	@Override
	public void buildFood()
	{
		FoodFactory foodFactory = new Food1Factory();
		meal.setFood(foodFactory.createFood());
	}
	@Override
	public void buildDrink()
	{
		DrinkFactory drinkFactory = new Drink1Factory();
	    meal.setDrink(drinkFactory.createDrink());
	}
}