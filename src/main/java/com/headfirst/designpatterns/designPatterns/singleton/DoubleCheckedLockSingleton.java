package com.headfirst.designpatterns.designPatterns.singleton;

public class DoubleCheckedLockSingleton {
	private volatile static DoubleCheckedLockSingleton uniqueInstance;

	public DoubleCheckedLockSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static DoubleCheckedLockSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (DoubleCheckedLockSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleCheckedLockSingleton();
				}

			}
		}

		return uniqueInstance;
	}
	
	public String getDescription() {
		return "Im a double-checked locking Singleton";
	}


}
