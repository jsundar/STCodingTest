package com.singtel.test;

import com.singtel.test.animal.Animal;
import com.singtel.test.animal.Cat;
import com.singtel.test.animal.Dog;
import com.singtel.test.animal.Frog;
import com.singtel.test.animal.bird.Bird;
import com.singtel.test.animal.bird.Butterfly;
import com.singtel.test.animal.bird.Caterpillar;
import com.singtel.test.animal.bird.Chicken;
import com.singtel.test.animal.bird.Duck;
import com.singtel.test.animal.bird.Parrot;
import com.singtel.test.animal.bird.Rooster;
import com.singtel.test.animal.fish.ClownFish;
import com.singtel.test.animal.fish.Dolphin;
import com.singtel.test.animal.fish.Fish;
import com.singtel.test.animal.fish.Shark;
import com.singtel.test.behaviour.impl.ButterflyBehavior;
import com.singtel.test.behaviour.impl.CatSound;
import com.singtel.test.behaviour.impl.ChickenSound;
import com.singtel.test.behaviour.impl.ClownFishBehaviour;
import com.singtel.test.behaviour.impl.DogSound;
import com.singtel.test.behaviour.impl.DuckSound;
import com.singtel.test.behaviour.impl.DuckSwim;
import com.singtel.test.behaviour.impl.FlightlessBird;
import com.singtel.test.behaviour.impl.FlyingBird;
import com.singtel.test.behaviour.impl.PhoneSound;
import com.singtel.test.behaviour.impl.RoosterSound;
import com.singtel.test.behaviour.impl.SharkFishBehavior;

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
		
		
		// Answer for B		
		System.out.println("======================================================================================");
		System.out.println("Answer for B Started");
		System.out.println("======================================================================================");
		Shark shark = new Shark();
		shark.setSharkFishBehavior(new SharkFishBehavior());
		shark.sing();
		shark.swim();
		shark.walk();
		System.out.println("Shark Fish Color : " + shark.getSharkFishBehavior().color());
		System.out.println("Shark Fish behaviour : " + shark.getSharkFishBehavior().behaviour());
		
		ClownFish clownfish = new ClownFish();
		clownfish.sing();
		clownfish.swim();
		clownfish.walk();
		
		clownfish.setClownFishBehaviour(new ClownFishBehaviour());
		
		System.out.println("ClownFish  Color : " + clownfish.getClownFishBehaviour().color());
		System.out.println("ClownFish  behaviour : " + clownfish.getClownFishBehaviour().behaviour());

		Dolphin dolphine = new Dolphin();
		dolphine.walk();
		System.out.println("Answer for B Ended.");
		
		// Answer for C
		System.out.println("======================================================================================");
		System.out.println("Answer for C Started");
		System.out.println("======================================================================================");
		Butterfly butterfly = new Butterfly();
		butterfly.setFlyBehaviour(new ButterflyBehavior());
		System.out.println("Butterfly : " + butterfly.getFlyBehaviour().fly());
		butterfly.walk();
		
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.fly();
		caterpillar.walk();
		System.out.println("Answer for C Ended.");
				
		//Answer for D
		System.out.println("======================================================================================");
		System.out.println("Answer for D Started");
		System.out.println("======================================================================================");
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly (),
				new Cat()
				};
		
		//Can you share the code to count:
			//1. How many of these animals can fly?
			//2. How many of these animals can walk?
			//3. How many of these animals can sing?
			//4. How many of these animals can swim?
		
		int countFlyBehavior = 0;
		int countwalkBehavior = 0;
		int countSingBehavior = 0;
		int countSwimBehavior = 0;
		
		countwalkBehavior = animals.length;
		
		for(Animal animal : animals) {
			if(animal instanceof Fish || animal instanceof Dolphin)  {
				countwalkBehavior--;
			} else if(animal instanceof Bird) {
				Bird bird1 = (Bird) animal;
				countFlyBehavior++;
				if(bird1 instanceof Parrot) {
					countSingBehavior++;
				}
				if(bird1 instanceof Duck) {
					countSwimBehavior++;
				}
			} else if(animal instanceof Fish) {
				countSwimBehavior++;
			} else if(animal instanceof Dolphin) {
				countSwimBehavior++;
			}
			
		}
		
		System.out.println("Count of Fly Behavor Animal : " + countFlyBehavior);
		System.out.println("Count of walk Behavor Animal : " + countwalkBehavior);
		System.out.println("Count of sing Behavor Animal : " + countSingBehavior);
		System.out.println("Count of swim Behavor Animal : " + countSwimBehavior);
		System.out.println("Answer for D Ended.");
		
	}

}
