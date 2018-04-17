package com.techelevator.animal;

public class TabbyCat extends CatAnimal {

	public TabbyCat() {
		super("Tabby Cat");
	}
	
	@Override 
	public int getWalkSpeed() {
		return 10;
	}

}
