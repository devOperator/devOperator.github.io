package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SPUTest {

	private SPU spu;

	@Before
	public void setup() {
		spu = new SPU();
	}
	
	@Test
	public void try_to_calculate_four_day_shipping_cost() {
		//Arrange
		//Act
		spu.calculateRate("O", 16, 100);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", spu.getFourDayCost() == .5);	
	}
	
	@Test
	public void try_to_calculate_two_day_shipping_cost() {
		//Arrange
		//Act
		spu.calculateRate("O", 1600, 100);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", spu.getTwoDayCost() == 500.000);
	}
	
	@Test
	public void try_to_calculate_over_night_shipping_cost() {
		//Arrange
		//Act
		spu.calculateRate("O", 160, 100);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", spu.getOverNightCost() == 75.00);			
	}
}
