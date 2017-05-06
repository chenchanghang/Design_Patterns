package com.chench.meal;

public class Meal2Builder extends MealBuilder {
	/*
	 * 套餐1： 一个鸡腿堡 一杯可乐
	 */
	@Override
	public void buildFood() {
		meal.setFood("一个鸡腿堡");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯可乐");
	}
}