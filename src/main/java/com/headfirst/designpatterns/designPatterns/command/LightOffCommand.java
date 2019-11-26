package com.headfirst.designpatterns.designPatterns.command;
import com.headfirst.designpatterns.designPatterns.command.Command;
import com.headfirst.designpatterns.designPatterns.command.Light;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {

		light.off();
	}

}
