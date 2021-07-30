package com.singtel.test.behaviour.impl;

import com.singtel.test.behaviour.FishBehaviour;

public class ClownFishBehaviour implements FishBehaviour{

	@Override
	public String color() {
		return "Clownfish are small and colourful (orange)";
	}

	@Override
	public String behaviour() {
		return "Clownfish make jokes";
	}

}
