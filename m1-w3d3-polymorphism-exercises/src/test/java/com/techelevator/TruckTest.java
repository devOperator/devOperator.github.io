package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TruckTest {

	private Truck truck;
	
	@Before
	public void setup() {
		truck = new Truck(4);
	}
	
	@Test
	public void try_to_calculate_the_toll_for_truck_with_four_axels() {
		//Arrange
		//Act
		truck.calculateToll(100);
		//Assert
		Assert.assertTrue("The toll was not calculated correctly", truck.getToll() == 4.00);
	}
	@Test
	public void try_to_calculate_the_toll_for_truck_with_six_axels() {
		//Arrange
		truck = new Truck(6);
		//Act
		truck.calculateToll(100);
		//Assert
		Assert.assertTrue("The toll was not calculated correctly", truck.getToll() == 4.50);
	}
	@Test
	public void try_to_calculate_the_toll_for_truck_with_eight_axels() {
		//Arrange
		truck = new Truck(8);
		//Act
		truck.calculateToll(100);
		//Assert
		Assert.assertTrue("The toll was not calculated correctly", truck.getToll() == 4.80);
	}
}
