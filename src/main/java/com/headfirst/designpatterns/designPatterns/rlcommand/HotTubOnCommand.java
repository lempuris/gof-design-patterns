package com.headfirst.designpatterns.designPatterns.rlcommand;

public class HotTubOnCommand implements Command {

	HotTub ht;

	public HotTubOnCommand(HotTub ht) {
		super();
		this.ht = ht;
	}

	@Override
	public void execute() {

		ht.on();
	}

}
