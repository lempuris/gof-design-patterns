package com.headfirst.designpatterns.designPatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWIthWings();
		}

	@Override
	
	public void display() {
		System.out.println("I’m a real Mallard duck");

	}

}
