package com.headfirst.designpatterns.designPatterns.rlcommand;

public class StereoOnWithCDCommand implements Command {

	Stereo st;

	public StereoOnWithCDCommand(Stereo st) {
		super();
		this.st = st;
	}

	@Override
	public void execute() {

		st.on();
		st.setCD();
		st.setVolume(11);
	}

}
