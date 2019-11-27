package com.headfirst.designpatterns.designPatterns.rlcommand;

public class MacroCommands implements Command {

	Command[] commands;

	public MacroCommands(Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {

		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {

		for (int i = commands.length-1; i >= 0; i--) {
			commands[i].undo();
		}
	}

}
