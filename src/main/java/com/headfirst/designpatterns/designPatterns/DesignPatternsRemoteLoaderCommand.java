package com.headfirst.designpatterns.designPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.headfirst.designpatterns.designPatterns.rlcommand.CeilingFan;
import com.headfirst.designpatterns.designPatterns.rlcommand.CeilingFanOffCommand;
import com.headfirst.designpatterns.designPatterns.rlcommand.CeilingFanOnCommand;
import com.headfirst.designpatterns.designPatterns.rlcommand.GarageDoor;
import com.headfirst.designpatterns.designPatterns.rlcommand.GarageDoorDownCommand;
import com.headfirst.designpatterns.designPatterns.rlcommand.GarageDoorUpCommand;
import com.headfirst.designpatterns.designPatterns.rlcommand.Light;
import com.headfirst.designpatterns.designPatterns.rlcommand.LightOffCommand;
import com.headfirst.designpatterns.designPatterns.rlcommand.LightOnCommand;
import com.headfirst.designpatterns.designPatterns.rlcommand.RemoteControl;
import com.headfirst.designpatterns.designPatterns.rlcommand.Stereo;
import com.headfirst.designpatterns.designPatterns.rlcommand.StereoOffCommand;
import com.headfirst.designpatterns.designPatterns.rlcommand.StereoOnWithCDCommand;

@SpringBootApplication
public class DesignPatternsRemoteLoaderCommand {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsRemoteLoaderCommand.class, args);
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);

		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);

		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);

		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);

		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}

}
