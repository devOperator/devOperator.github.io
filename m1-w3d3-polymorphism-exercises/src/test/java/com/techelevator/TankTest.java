package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TankTest {

	private Tank tank;
	
	@Before
	public void setup() {
		tank = new Tank();
	}
	
	@Test
	public void try_to_calculate_toll() {
		//Arrange
		//Act
		tank.calculateToll(100);
		//Assert
		Assert.assertTrue("The toll was not calculated propertly", tank.getToll() == 0.00);
	}
	
}
