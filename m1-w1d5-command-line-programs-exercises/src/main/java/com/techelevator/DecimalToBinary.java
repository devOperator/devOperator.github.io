package com.techelevator;

import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String userInput = in.nextLine();
		in.close();
		String[] decimalArr = userInput.trim().split("\\s+");
		
		for(int i = 0; i < decimalArr.length; i++) {
			System.out.println(decimalArr[i] + " in binary is " + Integer.toBinaryString(Integer.parseInt(decimalArr[i])));
		}
		
		/*
			int halvedNum;
			String binaryNumber = "";
	
			for(int i = 0; i < decimalArr.length; i++) {
				halvedNum = Integer.parseInt(decimalArr[i]);
				
				while(halvedNum != 0) {			
					binaryNumber = binaryNumber + ((halvedNum) % 2);
					halvedNum = halvedNum / 2;
				}
				if(binaryNumber.length() < 8) {
					for(int j = 0; j <= (8 - binaryNumber.length()); j++) {
						binaryNumber += '0';
					}	
				System.out.println(decimalArr[i] + " in binary is " + new StringBuilder(binaryNumber).reverse());
				binaryNumber = ""; 
		
				}
			}*/
	}

}
