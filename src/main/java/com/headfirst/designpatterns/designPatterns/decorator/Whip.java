package com.headfirst.designpatterns.designPatterns.decorator;

import com.headfirst.designpatterns.designPatterns.decorator.Beverage;
import com.headfirst.designpatterns.designPatterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.1 + beverage.cost();
	}

}
