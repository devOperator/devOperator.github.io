package com.techelevator;

public class FexEd implements DeliveryDriver {
//			rate = 20.00
//		    if distance > 500 miles then rate = rate + 5.00
//		    if weight > 48 ounces then rate = rate + 3.00
//	private double perMileRate;
//	private double distance;
	private double cost = 20.00;
	
	public double getCost() {
		return cost;
	}
	public void calculateRate(String weightUnit, int weight, int distance) {
		if(weightUnit.equals("O") && weight > 48 ||
			weightUnit.equals("P") && weight > 3) {
			cost += 3.00;
		}if(weightUnit.equals("O") && distance > 500 || weightUnit.equals("P") && distance > 500 ) {
			cost += 5.00;
		}if((weightUnit.equals("O") || weightUnit.equals("P")) && weight > 0 && distance > 0 ){
				
		}else {
			System.out.println("Invalid entry, cost shown invalid, try again");
			cost = 0.00;
		}
		System.out.println(String.format("%-26s $%.2f", "FexEd", cost));
	}


	
}
