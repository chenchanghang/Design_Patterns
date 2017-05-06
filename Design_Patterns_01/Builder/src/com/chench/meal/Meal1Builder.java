package com.chench.meal;

public class Meal1Builder extends MealBuilder {
	/*
	 * 套餐1： 一个鸡蛋卷 一杯果汁
	 */
	@Override
	public void buildFood() {
		meal.setFood("一个鸡蛋卷");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯果汁");
	}
}