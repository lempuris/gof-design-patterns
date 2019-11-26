package com.headfirst.designpatterns.designPatterns.rlcommand;

public class LivingRoomLightsOnCommand implements Command {

	Light light;

	public LivingRoomLightsOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

}
