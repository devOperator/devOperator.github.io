package com.techelevator.animal;

public class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public int getNumberOfLegs() {
		return 2;
	}
	
	public String getName() {
		return this.name;
	}
	
	private int getWalkSpeed() {
		return 5;
	}
	
}
