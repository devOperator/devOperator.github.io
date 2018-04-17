package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	/*
	 * Check if correct type fruit is created
	 * Check if correct number of fruit is created
	 * Check if fruit is removed as expected
	 * 
	 * */
	
	private FruitTree fruit;
	
	@Before
	public void setup() {
		fruit = new FruitTree("pear", 10 );
	}
	
	@Test
	public void check_to_see_if_right_type_of_tree_is_created() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("The correct type of fruit is not shown", "pear", fruit.getTypeOfFruit());
	}
	
	@Test
	public void check_to_see_if_right_number_of_fruit_are_created() {
		//Arrange
		//Act
		//Assert
		Assert.assertEquals("The correct type of fruit is not shown", 10 , fruit.getPiecesOfFruitLeft());

	}
	
	
	@Test
	public void try_to_remove_one_fruit() {
		//Arrange
		//Act
		fruit.PickFruit(1);
		//Assert
		Assert.assertEquals("No remove was removed", 9, fruit.getPiecesOfFruitLeft());
		
	}
	
	@Test
	public void try_to_remove_more_fruit_than_available() {
		//Arrange
		//Act
		fruit.PickFruit(11);
		//Assert
		Assert.assertEquals("More fruit was removed than available to be picked", 10, fruit.getPiecesOfFruitLeft());
		
	}
	
}
