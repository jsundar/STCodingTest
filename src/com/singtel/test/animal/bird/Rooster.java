package com.singtel.test.animal.bird;

import com.singtel.test.behaviour.FlyBehaviour;
import com.singtel.test.behaviour.SoundBehaviour;

public class Rooster extends Bird {
	
	private SoundBehaviour soundBehaviour;
	
	public SoundBehaviour getSoundBehaviour() {
		return soundBehaviour;
	}
	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
	

}
