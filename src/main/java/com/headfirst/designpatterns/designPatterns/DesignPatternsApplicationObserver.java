package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.observer.CurrentConditionsDipslay;
import com.headfirst.designpatterns.designPatterns.observer.WeatherData;

@SpringBootApplication
public class DesignPatternsApplicationObserver {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplicationObserver.class, args);

		WeatherData weatherData = new WeatherData();
		CurrentConditionsDipslay cd = new CurrentConditionsDipslay(weatherData);
		
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
