package com.headfirst.designpatterns.designPatterns.rlcommand;

public class HotTubOffCommand implements Command {

	HotTub ht;

	public HotTubOffCommand(HotTub ht) {
		super();
		this.ht = ht;
	}

	@Override
	public void execute() {

		ht.off();
	}

	@Override
	public void undo() {

		ht.on();
	}

}
