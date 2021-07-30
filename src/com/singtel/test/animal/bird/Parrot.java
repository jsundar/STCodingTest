package com.singtel.test.animal.bird;

import com.singtel.test.behaviour.SoundBehaviour;

public class Parrot extends Bird {

	// implementing using Composition with abstraction
	/**
	 * The composition is another mechanism provided by OOP for reusing implementation. 
	 * Composition allows us to model objects that are made up of other objects, thus defining a “has-a” relationship between them.
	 */

	private SoundBehaviour soundBehaviour;

	public SoundBehaviour getSoundBehaviour() {
		return soundBehaviour;
	}

	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	

}
