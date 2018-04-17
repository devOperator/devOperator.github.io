package com.techelevator;

public class Truck implements Vehicle {
	private double toll;
	private int axles;
	
	public Truck(int axles) {
		this.axles = axles;
	}
	public double getToll() {
		return toll;
	}
	
	public void calculateToll(int distance) {
		if(this.axles == 4) {
			toll = .040 * distance;
		}else if(this.axles == 6) {
			toll = .045 * distance;
		}else if(this.axles >= 8) {
			toll = .048 * distance;
		}
	}
	
	@Override
	public String toString() {
		return "Truck";
	}
	
}
