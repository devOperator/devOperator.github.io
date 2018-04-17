package com.techelevator.calculator;

public class Calculator {

	/*
	 * add
	 * subtract
	 * multiply
	 * divide
	 * pow
	 * absolute value
	 */
	
	private double result = 0;
	
	public double getResult() {
		return this.result;
	}
	
	public void reset() {
		result = 0;
	}
	public double add(double x) {
		result += x;
		return result;
	}
	
	public double subtract(double x) {
		result -= x;
		return result;
	}
}
