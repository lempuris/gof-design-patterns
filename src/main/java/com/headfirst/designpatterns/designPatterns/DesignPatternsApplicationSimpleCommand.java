package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.command.GarageDoor;
import com.headfirst.designpatterns.designPatterns.command.GarageDoorCloseCommand;
import com.headfirst.designpatterns.designPatterns.command.GarageDoorOpenCommand;
import com.headfirst.designpatterns.designPatterns.command.Light;
import com.headfirst.designpatterns.designPatterns.command.LightOnCommand;
import com.headfirst.designpatterns.designPatterns.command.SimpleRemoteControl;

@SpringBootApplication
public class DesignPatternsApplicationSimpleCommand {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplicationSimpleCommand.class, args);

		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor gd = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand openGarage = new GarageDoorOpenCommand(gd);
		GarageDoorCloseCommand closeGarage = new GarageDoorCloseCommand(gd);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(openGarage);
		remote.buttonWasPressed();
		remote.setCommand(closeGarage);
		remote.buttonWasPressed();

	}

}
