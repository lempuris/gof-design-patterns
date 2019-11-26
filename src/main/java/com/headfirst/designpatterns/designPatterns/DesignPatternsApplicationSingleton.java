package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.singleton.ChocolateBoiler;
import com.headfirst.designpatterns.designPatterns.singleton.ClassicSingleton;
import com.headfirst.designpatterns.designPatterns.singleton.DoubleCheckedLockSingleton;
import com.headfirst.designpatterns.designPatterns.singleton.EagerlyLoadedSingleton;
import com.headfirst.designpatterns.designPatterns.singleton.ThreadSafeSingleton;

@SpringBootApplication
public class DesignPatternsApplicationSingleton {

	public static void main(String args[]) {
		SpringApplication.run(DesignPatternsApplicationSingleton.class, args);

		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

		ClassicSingleton cs = ClassicSingleton.getInstance();
		System.out.println(cs.getDescription());

		DoubleCheckedLockSingleton dcl = DoubleCheckedLockSingleton.getInstance();
		System.out.println(dcl.getDescription());

		EagerlyLoadedSingleton es = EagerlyLoadedSingleton.getInstance();
		System.out.println(es.getDescription());

		ThreadSafeSingleton ts = ThreadSafeSingleton.getInstance();
		System.out.println(ts.getDescription());
	}

}
