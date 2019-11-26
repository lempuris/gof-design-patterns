package com.headfirst.designpatterns.designPatterns.singleton;

public class ClassicSingleton {
	private static ClassicSingleton uniqueInstance;

	public ClassicSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static ClassicSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ClassicSingleton();
		}

		return uniqueInstance;
	}

	public String getDescription() {
		return "Im a classic Singleton";
	}

}
