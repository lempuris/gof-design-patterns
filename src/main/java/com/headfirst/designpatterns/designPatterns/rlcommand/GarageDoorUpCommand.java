package com.headfirst.designpatterns.designPatterns.rlcommand;

public class GarageDoorUpCommand implements Command {

	GarageDoor gd;

	public GarageDoorUpCommand(GarageDoor gd) {
		super();
		this.gd = gd;
	}

	@Override
	public void execute() {

		gd.up();
	}

}
