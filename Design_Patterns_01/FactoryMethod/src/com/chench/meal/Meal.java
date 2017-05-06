package com.chench.meal;

public abstract class Meal {

	// 套餐包括主食和饮料
	private String food;
	private String drink;

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

}
