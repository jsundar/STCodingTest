package com.singtel.test.behaviour.impl;

import com.singtel.test.behaviour.FishBehaviour;

public class SharkFishBehavior implements FishBehaviour {

	@Override
	public String color() {
		return "Sharks are large and grey";
	}

	@Override
	public String behaviour() {
		return "Sharks eat other fish";
	}
}
