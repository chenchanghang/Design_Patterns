package com.chench.test;

import java.util.Scanner;

import com.chench.meal.KFCWaiter;
import com.chench.meal.Meal;
import com.chench.meal.Meal1Builder;
import com.chench.meal.Meal2Builder;
import com.chench.meal.MealBuilder;

public class Test {
	public static void main(String[] args) {
		/*
		 * 测试建造者模式
		 * 1.服务员直接根据顾客需求输入套餐号
		 * 2.服务员将搭配好的食物端给顾客
		 */
		
		System.out.print("所有套餐信息如下：\n (1)一个鸡蛋卷 + 一杯果汁\n (2)一个鸡腿堡 + 一杯可乐\n 请输入顾客选择的套餐号：");
		Scanner scanner = new Scanner(System.in);
		int submeal = scanner.nextInt();
		scanner.close();
		
		KFCWaiter kfcWaiter = new KFCWaiter();
		MealBuilder mealBuilder = null;
		
		switch (submeal) {
		case 1:
			mealBuilder = new Meal1Builder();
			break;
		case 2:
			mealBuilder = new Meal2Builder();
			break;
		default:
			System.out.println("套餐号输入错误");
			break;
		}
		
		kfcWaiter.setMealBuilder(mealBuilder);
		Meal meal = kfcWaiter.construct();
		
		System.out.println("端给顾客的食物：\n" + meal.getFood() + "\n" + meal.getDrink());
		
		
	}
}
