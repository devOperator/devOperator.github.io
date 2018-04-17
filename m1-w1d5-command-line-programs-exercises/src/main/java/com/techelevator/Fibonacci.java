package com.techelevator;

import java.io.InputStream;
import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the Fibonacci number: ");
		int fibNum = in.nextInt();
		in.close(); //what happens if not closed
		int num1 = 1;
		int num2 = 1;
		int sum = 2;
		System.out.print(0 + ", " + 1 + ", " + 1);
		while(fibNum >= (sum + num2)) {
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
			System.out.print(", " + sum);
			
		}	
		
	}

}
