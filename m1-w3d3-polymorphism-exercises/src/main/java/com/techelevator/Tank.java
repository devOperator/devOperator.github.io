package com.techelevator;

public class Tank implements Vehicle {
	private double toll;
	
	public double getToll() {
		return toll;
	}
	
	public void calculateToll(int distance) {
		toll = 0;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
}
