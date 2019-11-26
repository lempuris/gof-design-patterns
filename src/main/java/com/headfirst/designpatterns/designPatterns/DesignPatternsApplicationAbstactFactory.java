package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.abstractfactory.ChicagoPizzaStore;
import com.headfirst.designpatterns.designPatterns.abstractfactory.NYPizzaStore;
import com.headfirst.designpatterns.designPatterns.abstractfactory.Pizza;
import com.headfirst.designpatterns.designPatterns.abstractfactory.PizzaStore;

@SpringBootApplication
public class DesignPatternsApplicationAbstactFactory {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplicationAbstactFactory.class, args);

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chiStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "/n");

		pizza = chiStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "/n");

	}

}
