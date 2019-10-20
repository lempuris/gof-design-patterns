package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.factory.ChicagoPizzaStore;
import com.headfirst.designpatterns.designPatterns.factory.NYPizzaStore;
import com.headfirst.designpatterns.designPatterns.factory.Pizza;
import com.headfirst.designpatterns.designPatterns.factory.PizzaStore;

@SpringBootApplication
public class DesignPatternsApplicationFactory {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplicationFactory.class, args);

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chiStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "/n");

		pizza = chiStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "/n");

	}

}
