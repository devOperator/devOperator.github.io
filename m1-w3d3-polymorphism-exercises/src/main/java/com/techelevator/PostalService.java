package com.techelevator;

public class PostalService implements DeliveryDriver{
//	private double perMileRate;
//	private double distance;
	
	private double firstClassCost;
	private double secondClassCost;
	private double thirdClassCost;
	
	public void calculateRate(String weightUnit, int weight, int distance) {
	
		if(weightUnit.equals("O")){
			if(weight <= 2) {
				firstClassCost = .035 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (1st Class)", firstClassCost));
				secondClassCost = .0035 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (2nd Class)", secondClassCost));
				thirdClassCost = .0020 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (3rd Class)", thirdClassCost));
				
			}else if (weight > 2 && weight <= 8) {
				
				firstClassCost = .040 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (1st Class)", firstClassCost));
				secondClassCost = .0040 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (2nd Class)", secondClassCost));
				thirdClassCost = .0022 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (3rd Class)", thirdClassCost));
	
			}else if (weight >= 9 && weight <= 15) {
				
				firstClassCost = .047 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (1st Class)", firstClassCost));
				secondClassCost = .0047 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (2nd Class)", secondClassCost));
				thirdClassCost = .0024 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (3rd Class)", thirdClassCost));
			}
		}
		
		else if(weightUnit.equals("P")) {
			if(weight >= 1 && weight <= 3) {
				firstClassCost = .195 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (1st Class)", firstClassCost));
				secondClassCost = .0195 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (2nd Class)", secondClassCost));
				thirdClassCost = .0150 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (3rd Class)", thirdClassCost));
				
			}else if(weight >= 4 && weight <= 8) {
				firstClassCost = .450 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (1st Class)", firstClassCost));
				secondClassCost = .0450 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (2nd Class)", secondClassCost));
				thirdClassCost = .0160 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (3rd Class)", thirdClassCost));
				
			}else if(weight >= 9) {
				firstClassCost = .5 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (1st Class)", firstClassCost));
				secondClassCost = .05 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (2nd Class)", secondClassCost));
				thirdClassCost = .017 * distance;
				System.out.println(String.format("%-20s $%.2f", "Postal Service (3rd Class)", thirdClassCost));
		}
			
	}else {
		System.out.println("Error please try again");
	}
}

	public double getFirstClassCost() {
		return firstClassCost;
	}

	public double getSecondClassCost() {
		return secondClassCost;
	}

	public double getThirdClassCost() {
		return thirdClassCost;
	}
}
