package com.techelevator.dog;

import com.techelevator.calculator.Calculator;

public class Dog {
	
	//
	// Write code here
	//
	
	private boolean sleeping = false;
	
	public boolean isSleeping() {
		return sleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
	
	public Dog() {
		
	}


	/*
	public static void main (String[] args) {
		
		
	} */
	public String makeSound() {
		return sleeping? "Zzzzz..." : "Woof!";
	}
	public void sleep(){
		this.sleeping = true;
	}
	public void wakeUp() {
		this.sleeping = false;
	}
	
	
	
}
