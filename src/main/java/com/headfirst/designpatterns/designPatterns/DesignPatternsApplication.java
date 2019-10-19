package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.strategy.Duck;
import com.headfirst.designpatterns.designPatterns.strategy.MallardDuck;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}

}
