package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.strategy.Duck;
import com.headfirst.designpatterns.designPatterns.strategy.FlyRocketPowered;
import com.headfirst.designpatterns.designPatterns.strategy.MallardDuck;
import com.headfirst.designpatterns.designPatterns.strategy.ModelDuck;
import com.headfirst.designpatterns.designPatterns.strategy.MuteQuack;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performQuack();
		model.setQuackBehavior(new MuteQuack());
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
