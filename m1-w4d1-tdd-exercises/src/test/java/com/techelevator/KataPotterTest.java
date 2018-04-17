package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {
/*
 * ## Kata Potter

Once upon a time there was a series of 5 books

One copy of any of the five books costs 8$. 
If, however, you buy two different books from the series, you get a 5% discount on those two books. 
If you buy 3 different books, you get a 10% discount. With 4 different books, you get a 20% discount. 
If you go the whole hog, and buy all 5, you get a huge 25% discount.

Note that if you buy, say, four books, of which 3 are different titles, 
you get a 10% discount on the 3 that form part of a set, but the fourth book still costs 8$.

calculate price of any basket, giving as big a discount as possible.

Write tests that call a single method `double getCost(int[] books)`. 
Given an array of integers representing the various books purchased, calculate the cost as a decimal.
'''
2 copies of the first book
2 copies of the second book
2 copies of the third book
1 copy of the fourth book
1 copy of the fifth book
(answer: $51.20)

{2,2,2,1,1} 
could be 3 sets of 2 and 2 singles, 2 sets of 4, 1 set of 5 and 3 singles, 1 set of 5 and 1 set of 3.
```
**Clues**
*
*30 + 

- This Kata looks easy to start but there is a level that introduces complexity. 
However, consider that when you calculate the above basket, it isn't `5 * 8 * 0.75 + 3 * 8 *0.9`. 
It is actually `4 * 8 * 0.8 + 4 * 8 * 0.8`. The trick is to write code intelligent enough to notice 
two sets of four books is cheaper than a set of five and a set of 3.

One copy of any of the five books costs 8$. 
If you buy two different books, you get a 5% discount. 
If you buy 3 different books, you get a 10% discount. 
With 4 different books, you get a 20% discount. 
If you go the whole hog, and buy all 5, you get a huge 25% discount.

Note that if you buy, say, four books, of which 3 are different titles, 
you get a 10% discount on the 3 that form part of a set, but the fourth book still costs 8$.

1-> 0%
2-> 5%
3-> 10%
4 -> 20%
5 -> 25%
 * */
	//Sets result in higher bargains, so check for the largest groups of sets available calculate the value then 
	//calculate the remaining smaller groups then you check for any remaining single titles remaining.
	//subtract one from any index containing a value, make that a set, calculate the value then 
	//continue making smaller and smaller sets until nothing is remaining.
	///*** The way to find the biggest bargain is to compose the maximum number of highest value sets
	///and a set like 4 and 4 should be a set of 5 and 3, and a set of 2 and 2 should beat a set of 3 and 1.
	///a set of 3 and 4 47.2 should beat a set of 5 and 2 (45.20)
	//rule if even a pair would beat one higher and one lower pair ie 4,4 > 3,5
	//rule if odd the set with the highest high set wins ie 5,2 > 3,4
	KataPotter kp;
	
	@Before
	public void setup() {
		kp = new KataPotter();
	}
	@Test
	public void calculate_the_price_of_two_same_title() {
		int[] arr = new int[]{2};
		Assert.assertTrue("" , kp.getCost(arr) == 16.00);
	}
	
	
	@Test
	public void calculate_the_price_of_two_different_titles() {
		int[] arr = new int[]{1,2};
		Assert.assertTrue("" , kp.getCost(arr) == 23.20);
	}
	
	
	@Test
	public void calculate_the_price_of_three_different_titles() {
		int[] arr = new int[]{1,2,1};
		Assert.assertTrue("" , kp.getCost(arr) == 29.60);
	}
	
	
	@Test
	public void calculate_the_price_of_four_different_titles() {
		int[] arr = new int[]{1,2,1,2};
		Assert.assertTrue("" , kp.getCost(arr) == 40.8);
	}
	
	@Test
	public void calculate_the_price_of_five_different_titles() {
		int[] arr = new int[]{2,2,2,1,1}; 
		Assert.assertTrue("" , kp.getCost(arr) == 51.20);
	} 
	
	
	
	
}
