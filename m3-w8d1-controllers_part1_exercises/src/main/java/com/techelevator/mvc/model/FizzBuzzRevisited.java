package com.techelevator.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRevisited {

	private String divisableby2;
	private String alternativefizz;
	private String alternativebuzz;
	private String Number1;
	private String Number2;
	private String Number3;
	private String Number4;
	private String Number5;

	
	
public FizzBuzzRevisited(String divisableby1, String divisableby2, String alternativefizz, String alternativebuzz,
			String number1, String number2, String number3, String number4, String number5) {
		super();
		this.divisableby1 = divisableby1;
		this.divisableby2 = divisableby2;
		this.alternativefizz = alternativefizz;
		this.alternativebuzz = alternativebuzz;
		Number1 = number1;
		Number2 = number2;
		Number3 = number3;
		Number4 = number4;
		Number5 = number5;
		
	}

private String divisableby1;
public String getDivisableby1() {
	return divisableby1;
}
public void setDivisableby1(String divisableby1) {
	this.divisableby1 = divisableby1;
}
public String getDivisableby2() {
	return divisableby2;
}
public void setDivisableby2(String divisableby2) {
	this.divisableby2 = divisableby2;
}
public String getAlternativefizz() {
	return alternativefizz;
}
public void setAlternativefizz(String alternativefizz) {
	this.alternativefizz = alternativefizz;
}
public String getAlternativebuzz() {
	return alternativebuzz;
}
public void setAlternativebuzz(String alternativebuzz) {
	this.alternativebuzz = alternativebuzz;
}
public String getNumber1() {
	return Number1;
}
public void setNumber1(String number1) {
	Number1 = number1;
}
public String getNumber2() {
	return Number2;
}
public void setNumber2(String number2) {
	Number2 = number2;
}
public String getNumber3() {
	return Number3;
}
public void setNumber3(String number3) {
	Number3 = number3;
}
public String getNumber4() {
	return Number4;
}
public void setNumber4(String number4) {
	Number4 = number4;
}
public String getNumber5() {
	return Number5;
}
public void setNumber5(String number5) {
	Number5 = number5;
}
public List<String> getNumbers() {
	
	List<String> numbers = new ArrayList<>();
	numbers.add(Number1);
	numbers.add(Number2);
	numbers.add(Number3);
	numbers.add(Number4);
	numbers.add(Number5);
	return numbers;
}
//public void setNumbers(List<String> numbers) {
//	this.numbers = numbers;
//}

	
}
