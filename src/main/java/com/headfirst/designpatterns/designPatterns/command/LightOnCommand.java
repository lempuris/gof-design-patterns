package com.headfirst.designpatterns.designPatterns.command;
import com.headfirst.designpatterns.designPatterns.command.Command;
import com.headfirst.designpatterns.designPatterns.command.Light;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();

	}

}
