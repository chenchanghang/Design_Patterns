package com.chench.meal;

public class KFCWaiter {
	private MealBuilder mealBuilder;

	// 设置套餐建造者
	public void setMealBuilder(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}

	// 服务员搭配套餐
	public Meal construct() {
		mealBuilder.buildFood();
		mealBuilder.buildDrink();
		return mealBuilder.getMeal();
	}
}