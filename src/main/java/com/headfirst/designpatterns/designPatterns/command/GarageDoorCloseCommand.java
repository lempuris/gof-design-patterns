package com.headfirst.designpatterns.designPatterns.command;

public class GarageDoorCloseCommand implements Command {

	GarageDoor gd;

	public GarageDoorCloseCommand(GarageDoor gd) {
		this.gd = gd;
	}

	@Override
	public void execute() {
		gd.down();

	}

}
