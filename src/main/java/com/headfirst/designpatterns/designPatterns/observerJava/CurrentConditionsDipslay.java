package com.headfirst.designpatterns.designPatterns.observerJava;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDipslay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	Observable observable;

	public CurrentConditionsDipslay(Observable observable) {
		super();
		this.observable = observable;
		observable.addObserver(this);
	}


	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");

	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData wd = (WeatherData) obs;
			this.temperature = wd.getTemperature();
			this.humidity = wd.getHumidity();
			display();
		
		}
		
	}

}
