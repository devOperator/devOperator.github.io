package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {
	
	int[] factorize(int n) {
		List<Integer> factorList = new ArrayList<>();
		int tempPrime = 2;
		
		if(n != 3 && n != 2) {
			while(n >= tempPrime) {
				if(n % tempPrime == 0) {
					factorList.add(tempPrime);
					if(n == tempPrime) {
						break;
					}
					n = n / tempPrime;
				}else {
					tempPrime++;
				}
			}
			if(n > tempPrime) {
				while(tempPrime % 2 == 0 || (tempPrime % 3 == 0 && tempPrime != 3)) {
					tempPrime++;
				}
			}
		}else {
			factorList.add(n);
		}
		
		int[] array = new int[factorList.size()];
		for(int i = 0; i < factorList.size(); i++){
			array[i] = factorList.get(i);
			System.out.println(array[i]);
		}	
		for(int num : array) {
			System.out.println(num);
		}
		return array;
	}
}
