package com.headfirst.designpatterns.designPatterns;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.decoratorio.LowerCaseInputStream;

@SpringBootApplication
public class DesignPatternsApplicationDecoratorIo {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplicationDecoratorIo.class, args);

		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(
					"C:\\Users\\Admin\\Desktop\\JAVA\\DesignPatterns\\designpatterns\\src\\main\\resources\\text")));

			while ((c = in.read()) > 0) {
				System.out.print((char) c);
			}

			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
