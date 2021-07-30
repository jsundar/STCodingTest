package com.singtel.test.behaviour.impl;

import com.singtel.test.behaviour.SoundBehaviour;

public class DuckSound implements SoundBehaviour{

	@Override
	public String sound() {
		return "Quack , quack";
	}

}
