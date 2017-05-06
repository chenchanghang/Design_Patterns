package com.chench.meal;

public class Meal2Factory implements MealFactory {

	@Override
	public Meal createMeal() {
		return new Meal2();
	}
	
}
