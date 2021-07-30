package com.singtel.test.animal.fish;

import com.singtel.test.animal.Animal;

public class Fish extends Animal{
	
	public String sing() {
		return "Fish es don’t sing";
	}
	
	@Override
	public final void walk() {
		System.out.println("Fish es don’t walk");
	}
	public String swim() {
		return "Fish es can swim";
		
	}
}
