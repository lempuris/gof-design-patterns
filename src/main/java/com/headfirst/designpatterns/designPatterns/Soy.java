package com.headfirst.designpatterns.designPatterns;

import com.headfirst.designpatterns.designPatterns.decorator.Beverage;
import com.headfirst.designpatterns.designPatterns.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.15 + beverage.cost();
	}
	
	

}
