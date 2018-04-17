package com.techelevator;

public class Car implements Vehicle{
	private double toll;
	private boolean trailer;
	
	public Car(boolean trailer) {
		this.trailer = trailer;
	}
	
	public double getToll() {
		return this.toll;
	}
	
	public void calculateToll(int distance) {
		this.toll = distance * 0.020;
		if(this.trailer) {
			toll += 1.00;
		}
	}
	
	@Override
	public String toString() {
		return "Car";
	}

}
