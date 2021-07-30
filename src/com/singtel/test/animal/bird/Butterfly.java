package com.singtel.test.animal.bird;

import com.singtel.test.behaviour.FlyBehaviour;

public class Butterfly extends Bird {

	private FlyBehaviour flyBehaviour;
	
	@Override
	public void sing() {
		System.out.println("A butterfly does not make a sound");
	}
	
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
}
