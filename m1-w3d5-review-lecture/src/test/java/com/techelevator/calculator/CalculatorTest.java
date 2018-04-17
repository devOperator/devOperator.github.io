package com.techelevator.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@After
	public void cleanup() {
		calculator.reset();
	}
	
	/*
	 * Test Cases for Reset Method
	 */

	@Test
	public void reset_after_change() {
		// Setup (Arrange)
		calculator.add(125d);
		// Act
		calculator.reset();
		Assert.assertEquals("Result not 0 after reset", 0d, calculator.getResult(), 0.1);
	}

	@Test
	public void reset_when_zero()  {
		// Setup (Arrange)
		// Act
		calculator.reset();
		// Assert (Verify)
		Assert.assertEquals("Result not zero after reset", 0d, calculator.getResult(), 0.1d);
	}
	
	/*
	 * Test Case for the Add Method
	 */
	
	@Test
	public void add_one_numbers() {
		// Setup (Arrange)
		double firstNumber = 10;
		// Act
		double result = calculator.add(firstNumber);
		// Assert (Verification)
		Assert.assertEquals("Result is not 10", 10, result, 0.0001d);
	}
	
	@Test
	public void add_two_numbers() {
		// Setup (Arrange)
		double firstNumber = 10;
		double secondNumber = 15;
		calculator.add(secondNumber);
		// Act
		calculator.add(firstNumber);
		// Assert (Verification)
		Assert.assertEquals("Result is not 25", 25, 
				calculator.getResult(), 0.0001d);
	}
	
	@Test
	public void add_negative_number_to_zero() {
		// Setup (Arrange)
		// Act
		calculator.add(-150);
		//Assert
		Assert.assertEquals("Result is not -150", -150d, calculator.getResult(), 0.00001d);
	}
	
	@Test
	public void add_negative_number_to_negative_number() { 
		// Setup (Arrange)
		calculator.add(-100d);  // Result is now -100
		// Act
		calculator.add(-75d);   // Remove another 75
		// Assert
		Assert.assertEquals("Result is not -175", -175d, calculator.getResult(), 0.00001d);
	}
	
	@Test
	public void add_three_large_numbers() {
		// Setup (Arrange)
		double expected = 12567.89002d + 34345435366.09882201d + 834324324.98989d;
		// Act
		calculator.add(12567.89002d);
		calculator.add(34345435366.09882201d);
		calculator.add(834324324.98989d);
		// Assert
		Assert.assertEquals("Result is not as expected", expected, calculator.getResult(), 0.0000000001);
	}
	

	/*
	 * Test Cases for the Subtract Method
	 */
	public void subtract_number_on_start() {
		// Setup 
		// Act
		// Assert
	}
}
