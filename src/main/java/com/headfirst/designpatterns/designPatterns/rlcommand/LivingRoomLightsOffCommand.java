package com.headfirst.designpatterns.designPatterns.rlcommand;

public class LivingRoomLightsOffCommand implements Command {
	Light light;

	public LivingRoomLightsOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	@Override
	public void undo() {

		light.on();
	}

}
