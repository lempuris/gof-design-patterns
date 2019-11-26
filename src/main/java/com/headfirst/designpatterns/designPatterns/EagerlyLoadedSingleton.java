package com.headfirst.designpatterns.designPatterns;

public class EagerlyLoadedSingleton {
	
	private static EagerlyLoadedSingleton uniqueInstance = new EagerlyLoadedSingleton();
	
	public EagerlyLoadedSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static EagerlyLoadedSingleton getInstance() {
		return uniqueInstance;
	}
	
	public String getDescription() {
		return "I'm a statically initialized eagerly loaded Singleton!";
	}
	

}
