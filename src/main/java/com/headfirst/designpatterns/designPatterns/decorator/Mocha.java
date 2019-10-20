package com.headfirst.designpatterns.designPatterns.decorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	

	public Mocha(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.2 + beverage.cost();
	}

}
