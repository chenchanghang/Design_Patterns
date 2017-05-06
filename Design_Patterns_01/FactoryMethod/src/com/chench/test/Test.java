package com.chench.test;

import java.util.Scanner;

import com.chench.meal.Meal;
import com.chench.meal.Meal1Factory;
import com.chench.meal.Meal2Factory;
import com.chench.meal.MealFactory;

public class Test {
	public static void main(String[] args) {
		/*
		 * 测试工厂方法模式
		 * 1.输入套餐号
		 * 2.工厂生产套餐食物 
		 */
		
		System.out.print("所有套餐信息如下：\n (1)一个鸡蛋卷 + 一杯果汁\n (2)一个鸡腿堡 + 一杯可乐\n 请输入套餐号：");
		Scanner scanner = new Scanner(System.in);
		int submeal = scanner.nextInt();
		scanner.close();
		
		Meal meal = null;
		MealFactory mealFactory = null;
		
		switch (submeal) {
		case 1:
			mealFactory = new Meal1Factory();
			meal = mealFactory.createMeal();
			break;
		case 2:
			mealFactory = new Meal2Factory();
			meal = mealFactory.createMeal();
			break;
		default:
			System.out.println("套餐号输入错误");
			break;
		}
		
		System.out.println("套餐食物：\n" + meal.getFood() + "\n" + meal.getDrink());
		
		
	}
}
