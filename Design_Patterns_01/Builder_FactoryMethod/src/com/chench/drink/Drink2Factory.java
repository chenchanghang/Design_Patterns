package com.chench.drink;

public class Drink2Factory implements DrinkFactory {

	@Override
	public Drink createDrink() {
		return new Drink2();
	}

}
