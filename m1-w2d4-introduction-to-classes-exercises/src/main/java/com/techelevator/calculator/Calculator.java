package com.techelevator.calculator;

public class Calculator {



	/*
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	} */


	//
	// Write code here
	//
	
	private int currentValue = 0;
	
	
	public int getCurrentValue() {
		return currentValue;
	}
	
	public Calculator() {
		
	}
	/*
	public static void main (String[] args) {
		Calculator calc = new Calculator();
		calc.add(5);
		//calc.subtract(5);
		//calc.add(10);
		calc.multiply(2);
		calc.power(2);
		System.out.println("CV is " + calc.getCurrentValue());
		
	}  */
	
	public int add(int addend) {
		return this.currentValue = this.currentValue + addend;
	}
	
	public int multiply(int multiplier) {
		return this.currentValue = this.currentValue * multiplier;
	}
	public int subtract(int subtrahend) {
		return this.currentValue = this.currentValue - subtrahend;
	}
	public int power(int exponent) {
		for(int i = 1; i < exponent; i++) {
			this.currentValue *= this.currentValue;
		}
		return this.currentValue;
	}
	public void reset() {
		this.currentValue = 0;
	}
	
}




