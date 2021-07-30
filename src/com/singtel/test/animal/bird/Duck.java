package com.singtel.test.animal.bird;

import com.singtel.test.behaviour.FlyBehaviour;
import com.singtel.test.behaviour.SoundBehaviour;
import com.singtel.test.behaviour.SwimBehaviour;

public class Duck extends Bird {
	
	private FlyBehaviour flyBehaviour;
	private SoundBehaviour soundBehaviour;
	private SwimBehaviour swimBehaviour;
	
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public SwimBehaviour getSwimBehaviour() {
		return swimBehaviour;
	}
	public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}
	public SoundBehaviour getSoundBehaviour() {
		return soundBehaviour;
	}
	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
	
	
	

}
