package com.headfirst.designpatterns.designPatterns.rlcommand;

public class GarageDoorDownCommand implements Command {

	GarageDoor gd;

	public GarageDoorDownCommand(GarageDoor gd) {
		super();
		this.gd = gd;
	}

	@Override
	public void execute() {

		gd.down();
	}

}
