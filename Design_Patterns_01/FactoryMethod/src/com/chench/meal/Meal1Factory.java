package com.chench.meal;

public class Meal1Factory implements MealFactory {

	@Override
	public Meal createMeal() {
		return new Meal1();
	}

}
