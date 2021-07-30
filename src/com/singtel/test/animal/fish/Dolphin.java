package com.singtel.test.animal.fish;

import com.singtel.test.animal.Animal;
import com.singtel.test.behaviour.SwimBehaviour;

public class Dolphin extends Animal {
	
	private SwimBehaviour swimBehaviour;

	public SwimBehaviour getSwimBehaviour() {
		return swimBehaviour;
	}

	public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}
	
	@Override
	public final void walk() {
		System.out.println("Dolphin es don’t walk");
	}

}
