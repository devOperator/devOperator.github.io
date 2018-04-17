package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FedExTest {
	
	private FexEd fe;
	@Before
	public void setup() {
		fe = new FexEd();
	}
	
	@Test
	public void try_to_calculate_the_shipping_cost_at_over_500_miles_under_48_oz() {
		//Arrange
		//Act
		fe.calculateRate("O", 10, 600);
		//Assert
		Assert.assertTrue("The cost was not calculated correctly", fe.getCost() == 25.00);
	}
	@Test
	public void try_to_calculate_the_shipping_cost_under_500_miles_over_48_oz() {
		//Arrange
		//Act
		fe.calculateRate("P", 4, 200);
		//Assert
		Assert.assertTrue("The cost was not calculated correctly", fe.getCost() == 23.00);
	}
	
	@Test
	public void try_to_calculate_the_shipping_cost_under_500_miles_under_48_oz() {
		//Arrange
		//Act
		fe.calculateRate("O", 10, 200);
		//Assert
		Assert.assertTrue("The cost was not calculated correctly", fe.getCost() == 20.00);		
	}
	@Test
	public void try_to_calculate_the_shipping_cost_over_500_miles_over_48_oz() {
		//Arrange
		//Act
		fe.calculateRate("O", 50, 600);
		//Assert
		Assert.assertTrue("The cost was not calculated correctly", fe.getCost() == 28.00);		
	}
	
	@Test
	public void try_to_calculate_the_shipping_cost_with_invalid_weight() {
		//Arrange
		//Act
		fe.calculateRate("O", -50, 200);
		//Assert
		Assert.assertTrue("User error Cost should not change from default", fe.getCost() == 0.00);		
	}
	
	@Test
	public void try_to_calculate_the_shipping_cost_with_invalid_weight_unit() {
		//Arrange
		//Act
		fe.calculateRate("Potato", 50, 200); //potato test
		//Assert
		Assert.assertTrue("User error Cost should not change from default", fe.getCost() == 0.00);		
	}
	
	@Test
	public void try_to_calculate_the_shipping_cost_with_invalid_distance(){
		//Arrange
		//Act
		fe.calculateRate("O", 50, -200);
		//Assert
		Assert.assertTrue("User error Cost should not change from default", fe.getCost() == 0.00);		
	}
	
}
