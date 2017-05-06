package com.chench.drink;

public class Drink1Factory implements DrinkFactory {

	@Override
	public Drink createDrink() {
		return new Drink1();
	}
	

}
