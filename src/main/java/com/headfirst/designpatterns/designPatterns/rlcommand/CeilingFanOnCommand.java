package com.headfirst.designpatterns.designPatterns.rlcommand;

public class CeilingFanOnCommand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {

		ceilingFan.high();
	}

	@Override
	public void undo() {

		ceilingFan.off();
	}

}
