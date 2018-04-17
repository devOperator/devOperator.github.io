package com.techelevator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PostalServiceTest {
	
	private PostalService ps;

	@Before
	public void setup() {
		ps = new PostalService();
	}
	
	
	@Test
	public void try_to_calculate_first_class_rate_with_2_oz_weight() {
		//Arrange
		//Act 
		ps.calculateRate("O", 2, 340);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", ps.getFirstClassCost() == 11.9);
	}
	@Test
	public void try_to_calculate_first_class_rate_with_4_oz() {
		//Arrange
		//Act 
		ps.calculateRate("O", 4, 340);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", ps.getFirstClassCost() == 13.6);
	}
	@Test
	public void try_to_calculate_first_class_rate_with_9_oz() {
		//Arrange
		//Act 
		ps.calculateRate("O", 9, 340);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", ps.getFirstClassCost() == 15.98);
	}
	
	@Test
	public void try_to_calculate_first_class_rate_with_invalid_weight_unit() {
		//Arrange
		//Act 
		ps.calculateRate("Potato", 2, 340);
		//Assert
		Assert.assertTrue("The cost should not be calculated", ps.getFirstClassCost() == 0.0);
	}
	
	
	@Test
	public void try_to_calculate_first_class_rate_with_2_lbs_weight() {
		//Arrange
		//Act 
		ps.calculateRate("P", 2, 340);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", ps.getFirstClassCost() == 66.3);
	}
	@Test
	public void try_to_calculate_first_class_rate_with_4_lbs() {
		//Arrange
		//Act 
		ps.calculateRate("P", 4, 340);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", ps.getFirstClassCost() == 153.0);
	}
	@Test
	public void try_to_calculate_first_class_rate_with_9_lbs() {
		//Arrange
		//Act 
		ps.calculateRate("P", 9, 340);
		//Assert
		Assert.assertTrue("Cost incorrectly calculated", ps.getFirstClassCost() == 170.0);
	}
	
	@Test
	public void try_to_calculate_first_class_rate_with_invalid_weight() {
		//Arrange
		//Act 
		ps.calculateRate("P", -100, 340);
		//Assert
		Assert.assertTrue("The cost should not be calculated", ps.getFirstClassCost() == 0.0);
	}
	@Test
	public void try_to_calculate_second_class_rate_with_invalid_weight() {
		//Arrange
		//Act 
		ps.calculateRate("P", -100, 340);
		//Assert
		Assert.assertTrue("The cost should not be calculated", ps.getSecondClassCost() == 0.0);
	}
	@Test
	public void try_to_calculate_third_class_rate_with_invalid_weight() {
		//Arrange
		//Act 
		ps.calculateRate("P", -100, 340);
		//Assert
		Assert.assertTrue("The cost should not be calculated", ps.getThirdClassCost() == 0.0);
	}
}
