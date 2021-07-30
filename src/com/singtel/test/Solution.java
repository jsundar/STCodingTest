package com.singtel.test;

import com.singtel.test.animal.bird.Bird;
import com.singtel.test.animal.bird.Chicken;
import com.singtel.test.animal.bird.Duck;
import com.singtel.test.animal.bird.Parrot;
import com.singtel.test.animal.bird.Rooster;
import com.singtel.test.behaviour.impl.CatSound;
import com.singtel.test.behaviour.impl.ChickenSound;
import com.singtel.test.behaviour.impl.DogSound;
import com.singtel.test.behaviour.impl.DuckSound;
import com.singtel.test.behaviour.impl.DuckSwim;
import com.singtel.test.behaviour.impl.FlightlessBird;
import com.singtel.test.behaviour.impl.FlyingBird;
import com.singtel.test.behaviour.impl.PhoneSound;
import com.singtel.test.behaviour.impl.RoosterSound;

public class Solution {
	
	public static void main(String[] args) {
		
		//Answer for A.1
		
		System.out.println("======================================================================================");
		System.out.println("Answer for A.1 Started");
		System.out.println("======================================================================================");
		Bird bird = new Bird();
		bird.walk();
		//bird.fly();
		bird.sing();
		System.out.println("Answer for A.1 Ended .");
		
		//Answer for A.2
		System.out.println("======================================================================================");
		System.out.println("Answer for A.2 Started");
		System.out.println("======================================================================================");
		Duck duck = new Duck();
		duck.setFlyBehaviour(new FlyingBird());
		System.out.println(duck.getFlyBehaviour().fly());
		
		duck.setSoundBehaviour(new DuckSound());
		System.out.println(duck.getSoundBehaviour().sound());
		
		duck.setSwimBehaviour(new DuckSwim());
		System.out.println(duck.getSwimBehaviour().swim());
		duck.walk();
		
		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFlyBehaviour(new FlightlessBird());
		System.out.println(chicken.getFlyBehaviour().fly());
		
		chicken.setSoundBehaviour(new ChickenSound());
		System.out.println(chicken.getSoundBehaviour().sound());
		chicken.walk();
		System.out.println("Answer for A.2 Ended.");
		//Answer for A.3 
		System.out.println("======================================================================================");
		System.out.println("Answer for A.3 Started");
		System.out.println("======================================================================================");
		Rooster rooster = new Rooster();
		rooster.setFlyBehaviour(new FlyingBird());
		System.out.println(rooster.getFlyBehaviour().fly());

		rooster.setSoundBehaviour(new RoosterSound());
		System.out.println(rooster.getSoundBehaviour().sound());
		
		rooster.walk();
		System.out.println("Answer for A.3 Ended.");
		
		// Answer for A.4
		System.out.println("======================================================================================");
		System.out.println("Answer for A.4 Started");
		System.out.println("======================================================================================");
		Parrot parrot = new Parrot();
		parrot.setSoundBehaviour(new DogSound());
		System.out.println("A parrot living with dogs says: " + parrot.getSoundBehaviour().sound());
		parrot.setSoundBehaviour(new DuckSound());
		System.out.println("A parrot living with cats says: " + parrot.getSoundBehaviour().sound());
		parrot.setSoundBehaviour(new CatSound());
		System.out.println("A parrot living near the rooster says: " + parrot.getSoundBehaviour().sound());
		parrot.setSoundBehaviour(new RoosterSound());
		System.out.println("A parrot living near the Ducks says:"+ parrot.getSoundBehaviour().sound());
		parrot.setSoundBehaviour(new PhoneSound());
		System.out.println("A parrot living near the Phone says:" + parrot.getSoundBehaviour().sound());
		System.out.println("Answer for A.4 Ended.");
		
		
	}

}
