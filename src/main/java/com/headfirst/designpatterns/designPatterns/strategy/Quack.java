package com.headfirst.designpatterns.designPatterns.strategy;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
		
	}

}
