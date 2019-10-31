package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.observerJava.CurrentConditionsDipslay;
import com.headfirst.designpatterns.designPatterns.observerJava.ForecastDisplay;
import com.headfirst.designpatterns.designPatterns.observerJava.WeatherData;

@SpringBootApplication
public class DesignPatternsApplicationObserverJ {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplicationObserverJ.class, args);

		WeatherData weatherData = new WeatherData();
		CurrentConditionsDipslay cd = new CurrentConditionsDipslay(weatherData);
		ForecastDisplay fd = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
