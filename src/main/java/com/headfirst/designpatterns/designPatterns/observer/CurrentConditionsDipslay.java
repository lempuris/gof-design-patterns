package com.headfirst.designpatterns.designPatterns.observer;

public class CurrentConditionsDipslay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentConditionsDipslay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		temperature = temp;
		this.humidity = humidity;
		display();

	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");

	}

}
