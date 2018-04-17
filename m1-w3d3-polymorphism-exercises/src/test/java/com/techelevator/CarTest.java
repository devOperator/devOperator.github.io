package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
	
	private Car car;
	
	@Before
	public void setup() {
		car = new Car(false);
	}
	
	@Test
	public void try_to_calculate_toll() {
		//Arrange
		//Act
		car.calculateToll(100);
		//Assert
		Assert.assertTrue("The toll was not calculated propertly", car.getToll() == 2.00);
	}
	
	@Test
	public void try_to_calculate_toll_for_car_with_trailer() {
		//Arrange
		car = new Car(true);
		//Act
		car.calculateToll(100);
		//Assert
		Assert.assertTrue("The toll was not calculated propertly", car.getToll() == 3.00);
	}
	
}
