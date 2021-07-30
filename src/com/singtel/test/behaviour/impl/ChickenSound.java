package com.singtel.test.behaviour.impl;

import com.singtel.test.behaviour.SoundBehaviour;

public class ChickenSound implements SoundBehaviour {
	
	@Override
	public String sound() {
		return "Cluck, cluck";
	}

}
