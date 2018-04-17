package com.techelevator.animal;

public class CatAnimal extends Animal {

	public CatAnimal(String name) {
		super(name);
	}
	
	@Override
	public int getNumberOfLegs() {
		return 4;
	}
	
	public int getWalkSpeed() {
		return 25;
	}

}
