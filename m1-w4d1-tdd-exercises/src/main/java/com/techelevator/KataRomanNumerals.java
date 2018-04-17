package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {

	public int romanToNewConverter(String numeral) {
	//numeral = "I";
	int modernNum = 0;
	Map<String, Integer> numToNumeral = new HashMap<String, Integer>();
	
	numToNumeral.put("I", 1);
	numToNumeral.put("II", 2);
	numToNumeral.put("III", 3);
	numToNumeral.put("IV", 4);
	numToNumeral.put("V", 5);
	numToNumeral.put("VI", 6);
	numToNumeral.put("VII", 7);
	numToNumeral.put("VIII", 8);
	numToNumeral.put("IX", 9);
	numToNumeral.put("X", 10);
	numToNumeral.put("XL", 40);
	numToNumeral.put("L", 50);
	numToNumeral.put("XC", 90);
	numToNumeral.put("C", 100);
	numToNumeral.put("CD", 400);
	numToNumeral.put("D", 500);
	numToNumeral.put("CM", 900);
	numToNumeral.put("M", 1000);
	
	
	//System.out.println(numeral);
	if(numToNumeral.containsKey(numeral)) {
		modernNum = numToNumeral.get(numeral);
	}else{
		for(int i = 0; i < numeral.length() - 1; i++) {
			if(numToNumeral.get(numeral.substring(i,i+1)) < numToNumeral.get(numeral.substring(i+1,i+2))) {
				modernNum += (numToNumeral.get(numeral.substring(i+1,i+2)) - 
						numToNumeral.get(numeral.substring(i,i+1)));
			
				System.out.println("41 " + modernNum);	
				i++;
			}else {
				modernNum += numToNumeral.get(numeral.substring(i,i+1));
				System.out.println("44 " + modernNum);	
			}
		}
		
		if(numToNumeral.get(numeral.substring(numeral.length() - 1, numeral.length()))
				<= numToNumeral.get(numeral.substring(numeral.length() - 2, numeral.length() - 1))) {
			modernNum += numToNumeral.get(numeral.substring(numeral.length() - 1, numeral.length()));
		}
		System.out.println("48 "+ modernNum);	
	}	
		return modernNum;
	}
	
	
	public String newToRomanConverter(Integer number) {
		String romanNumeral = "";
		String romanNumeral1 = "";
		String romanNumeral10 = "";
		String romanNumeral100 = "";
		String romanNumeral1000 = "";
		int[] digitArr = new int[] {0,0,0,0};
 
		Map<Integer, String> numeralToNum = new HashMap<Integer,String>();
		
		numeralToNum.put(1, "I");
		numeralToNum.put(2, "II");
		numeralToNum.put(3, "III");
		numeralToNum.put(4, "IV");
		numeralToNum.put(5, "V");
		numeralToNum.put(6, "VI");
		numeralToNum.put(7, "VII");
		numeralToNum.put(8, "VIII");
		numeralToNum.put(9, "IX");
		numeralToNum.put(10, "X");
		numeralToNum.put(40, "XL");
		numeralToNum.put(50, "L");
		numeralToNum.put(90, "XC");
		numeralToNum.put(100, "C");
		numeralToNum.put(400, "CD");
		numeralToNum.put(500, "D");
		numeralToNum.put(900, "CM");
		numeralToNum.put(1000, "M");
		
		if(numeralToNum.containsKey(number)) {
			romanNumeral = numeralToNum.get(number);	
		}
			
		else {		
			if(number > 1000) {
				digitArr[3] = number / 1000;
				digitArr[2] = (number % 1000) / 100;
				digitArr[1] = (number % 1000 % 100) / 10;
				digitArr[0] = number % 1000 % 100 % 10;
			}else if(number > 100) {
				digitArr[2] = number / 100;
				digitArr[1] = (number % 100) / 10;
				digitArr[0] = number % 100 % 10;
			}else if(number > 10) {
				digitArr[1] = number / 10;
				digitArr[0] = number % 10;
			}
			
			for(int i = 0; i < digitArr.length; i++) {
				if(i == 0 && digitArr[i]!=0){
					romanNumeral1 = numeralToNum.get(digitArr[i]);			
				}else if(i == 1) {
					if(digitArr[i] > 5 && digitArr[i] != 9) {
						romanNumeral10 = numeralToNum.get(50);
						for(int tens = 0; tens < digitArr[i] - 5; tens++) {
							romanNumeral10 += numeralToNum.get(10);
						}
					}else if(digitArr[i] < 5 && digitArr[i] != 4) {
						for(int tens = 0; tens < digitArr[i]; tens++) {
							romanNumeral10 += numeralToNum.get(10);
						}
					}
					else{
						romanNumeral += numeralToNum.get(number * 10);	
					}
				}else if(i == 2) {
					if(digitArr[i] > 5 && digitArr[i] != 9) {
						romanNumeral100 = numeralToNum.get(500);
						for(int tens = 0; tens < digitArr[i] - 5; tens++) {
							romanNumeral100 += numeralToNum.get(100);
						}
					}else if(digitArr[i] < 5 && digitArr[i] != 4) {
						for(int tens = 0; tens < digitArr[i]; tens++) {
							romanNumeral100 += numeralToNum.get(100);
						}
					}
					else{
						romanNumeral += numeralToNum.get(number * 100);	
					}
				}else if(i == 3) {
						for(int tens = 0; tens < digitArr[i]; tens++) {
							romanNumeral1000 += numeralToNum.get(1000);
						}
				}
			} 
		}
		return romanNumeral1000 + romanNumeral100 + romanNumeral10 + romanNumeral1 + romanNumeral;
	} 
}
