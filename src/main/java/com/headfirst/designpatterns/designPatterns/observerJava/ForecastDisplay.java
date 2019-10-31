package com.headfirst.designpatterns.designPatterns.observerJava;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	@SuppressWarnings("unused")
	private float lastPressure;
	Observable observable;

	public ForecastDisplay(Observable observable) {
		super();
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData wd = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = wd.getPressure();
			display();
		}

	}

	@Override
	public void display() {
		System.out.println("The current pressure is " + currentPressure);

	}

}
