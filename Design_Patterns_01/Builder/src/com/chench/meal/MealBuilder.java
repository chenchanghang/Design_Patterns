package com.chench.meal;

public abstract class MealBuilder {
	// 建造者基类
	// 定义套餐由主食和饮料组成
	protected Meal meal = new Meal();

	public abstract void buildFood();

	public abstract void buildDrink();

	public Meal getMeal() {
		return meal;
	}
}