package com.chench.meal;

import com.chench.drink.Drink;
import com.chench.food.Food;

public class Meal
{
	//套餐包括主食和饮料
	private Food food;
	private Drink drink;
	
	public void setFood(Food food) {
		this.food = food; 
	}

	public void setDrink(Drink drink) {
		this.drink = drink; 
	}

	public Food getFood() {
		return (this.food); 
	}

	public Drink getDrink() {
		return (this.drink); 
	}
}