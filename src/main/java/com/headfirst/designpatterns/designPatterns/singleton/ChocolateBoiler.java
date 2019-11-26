package com.headfirst.designpatterns.designPatterns.singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;

	private static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating a new instance of ChocolateBoiler");
			uniqueInstance = new ChocolateBoiler();
		}

		System.out.println("Returning an instance of ChocolateBoiler");
		return uniqueInstance;
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill boiler with mixture
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
			// drain the mixture
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}

}
