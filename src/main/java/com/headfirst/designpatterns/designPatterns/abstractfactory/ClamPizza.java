package com.headfirst.designpatterns.designPatterns.abstractfactory;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFctory;

	public ClamPizza(PizzaIngredientFactory ingredientFctory) {
		super();
		this.ingredientFctory = ingredientFctory;
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub

	}

}
