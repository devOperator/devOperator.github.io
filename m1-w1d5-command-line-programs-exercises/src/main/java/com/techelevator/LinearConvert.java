package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		int userLengthInput = in.nextInt();
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String unit = in.next().toUpperCase();
		in.close(); 
		
		if(unit.equals("M")) {
			System.out.println(userLengthInput+"m is " + (int) (3.2808399 * userLengthInput) +"f");
		}
		else {
			System.out.println(userLengthInput + "f is " + (int) (.3048 * userLengthInput) + "m");
		}
		
	}

}
