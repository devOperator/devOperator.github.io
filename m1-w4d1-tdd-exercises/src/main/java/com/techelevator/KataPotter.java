package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPotter {
	
	double getCost(int[] books) {
		
		double returnValue = 0.00;
		double[] discountArr = new double[]{0,.95, .9, .8, .75};
		boolean finished = false;
		int booksInSet = 0;
		int[] bookSetCt = new int[5];
		
		while(!finished) {
			for(int i = 0; i < books.length; i++) {
				if(books[i] >= 1) {
					booksInSet++;
					books[i]--;
				}
			}
			if(booksInSet == 5) {
				bookSetCt[4]++;
				booksInSet = 0;
			}else if(booksInSet == 4) {
				bookSetCt[3]++;
				booksInSet = 0;
			}else if(booksInSet == 3) {
				bookSetCt[2]++;
				booksInSet = 0;
			}else if(booksInSet == 2) {
				bookSetCt[1]++;
				booksInSet = 0;
			}else if(booksInSet == 1) {
				bookSetCt[0]++;
				booksInSet = 0;
			}else if(booksInSet == 0) {
				finished = true;
			}
		}
		
		//two sets of four books is cheaper than a set of five and a set of 3.
		
		if(bookSetCt[4] == 1 && bookSetCt[2] == 1) {
			returnValue = 2 * 4 * 8 * discountArr[3];
		}else {
			returnValue = 8 * bookSetCt[0]  + 2 * 8 * bookSetCt[1] * discountArr[1]+ 
					3 * 8 * bookSetCt[2] * discountArr[2] + 4 * 8 * bookSetCt[3] * discountArr[3] + 
					5 * 8 * bookSetCt[4] * discountArr[4];
		} 
		
		return returnValue;
	}
		
}
