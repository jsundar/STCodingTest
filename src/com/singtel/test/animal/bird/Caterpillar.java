package com.singtel.test.animal.bird;

import com.singtel.test.animal.Animal;

public class Caterpillar extends Animal {
	
	public void fly() {
		System.out.println("A caterpillar cannot fly");
	}
	@Override
	public void walk() {
		System.out.println("A caterpillar can walk (crawl)");
	}
	
}
