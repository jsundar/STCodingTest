package com.singtel.test.animal.bird;

import com.singtel.test.animal.Animal;
import com.singtel.test.behaviour.FlyBehaviour;

public class Bird extends Animal {
	
	private FlyBehaviour flyBehaviour;
	
	public void sing() {
		System.out.println("I am Singing");
	}
	
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
}
