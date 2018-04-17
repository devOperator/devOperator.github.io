package com.techelevator;

public class KataFizzBuzz {

	public String FizzBuzz(int number) {
		
		if (number <= 0 || number > 100) {
			return "";
		}
		
		if (isFizz(number) && isBuzz(number)) {
			return "FizzBuzz";
		} 
		else if (isFizz(number)) 
		{
			return "Fizz";
		}
		else if (isBuzz(number)) {
			return "Buzz";
		} 
		
		return String.valueOf(number);
	}
	
	public boolean isFizz(int number) {
		return number % 3 == 0 || String.valueOf(number).contains("3");
	}
	
	public boolean isBuzz(int number) {
		return number % 5 == 0 || String.valueOf(number).contains("5");
	}
}
