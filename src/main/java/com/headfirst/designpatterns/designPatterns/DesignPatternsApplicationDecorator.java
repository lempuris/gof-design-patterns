package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.decorator.Beverage;
import com.headfirst.designpatterns.designPatterns.decorator.DarkRoast;
import com.headfirst.designpatterns.designPatterns.decorator.Espresso;
import com.headfirst.designpatterns.designPatterns.decorator.HouseBlend;
import com.headfirst.designpatterns.designPatterns.decorator.Mocha;

@SpringBootApplication
public class DesignPatternsApplicationDecorator {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplicationDecorator.class, args);

		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + "$" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
	}

}
