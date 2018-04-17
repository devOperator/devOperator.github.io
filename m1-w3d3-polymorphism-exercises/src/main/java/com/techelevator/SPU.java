package com.techelevator;

public class SPU implements DeliveryDriver{

//	SPU "is-a" DeliveryDriver and follows a simple formula based upon class, weight (in lbs) and distance.
//
//    If four-day ground then rate = (weight * 0.0050) * distance
//    If two-day business then rate = (weight * 0.050) * distance
//    if next day then rate = (weight * 0.075) * distance
//	private double perMileRate;
//	private double distance;
	
	private double fourDayCost = 0.00;
	
	public double getFourDayCost() {
		return fourDayCost;
	}
	public double getTwoDayCost() {
		return twoDayCost;
	}
	public double getOverNightCost() {
		return overNightCost;
	}

	private double twoDayCost = 0.00;
	private double overNightCost = 0.00;
	private double spuWeight = 0.00;
	public void calculateRate(String weightUnit, int weight, int distance) {
		
		if(weightUnit.equals("O")) {
			spuWeight = (double) weight / (double) 16;
		}
		
		fourDayCost = (spuWeight * .0050) * distance;
		System.out.println(String.format("%-26s $%.2f", "SPU (4-day ground) ", fourDayCost ));
		twoDayCost = (spuWeight * .050) * distance;
		System.out.println(String.format("%-26s $%.2f", "SPU (2-day business) ", twoDayCost ));
		overNightCost = (spuWeight * .075) * distance;
		System.out.println(String.format("%-26s $%.2f", "SPU (next-day) ", overNightCost ));
		
	}
	
}

