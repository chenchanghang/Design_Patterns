package com.chench.food;

public class Food2Factory implements FoodFactory {

	@Override
	public Food createFood() {
		return new Food2();
	}

}
