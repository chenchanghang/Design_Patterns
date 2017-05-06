package com.chench.food;

public class Food1Factory implements FoodFactory {

	@Override
	public Food createFood() {
		return new Food1();
	}

}
