package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	KataFizzBuzz fb;
	
	@Before
	public void setup() {
		fb = new KataFizzBuzz();
	}
	
	@Test
	public void returns_empty_string_below_boundary() {
		Assert.assertEquals("", fb.FizzBuzz(0));
		Assert.assertEquals("", fb.FizzBuzz(-100));
	}
	
	@Test
	public void returns_empty_string_above_boundary() {
		Assert.assertEquals("", fb.FizzBuzz(101));
		Assert.assertEquals("", fb.FizzBuzz(150));
	}
	
	@Test
	public void returns_Fizz_for_multiples_of_3() {
		Assert.assertEquals("Fizz", fb.FizzBuzz(3));
		Assert.assertEquals("Fizz", fb.FizzBuzz(9));
		Assert.assertEquals("Fizz", fb.FizzBuzz(6));
	}
	
	@Test
	public void returns_Buzz_for_multiples_of_5() {
		Assert.assertEquals("Buzz", fb.FizzBuzz(5));
		Assert.assertEquals("Buzz", fb.FizzBuzz(10));
		Assert.assertEquals("Buzz", fb.FizzBuzz(20));
	}
	
	@Test 
	public void returns_Fizz_for_numbers_that_contain_the_digit_3() {
		Assert.assertEquals("Fizz", fb.FizzBuzz(13));
		Assert.assertEquals("Fizz", fb.FizzBuzz(23));
		Assert.assertEquals("Fizz", fb.FizzBuzz(31));
	}
	
	@Test 
	public void returns_Fizz_for_numbers_that_contain_the_digit_5() {
		Assert.assertEquals("Buzz", fb.FizzBuzz(52));
		Assert.assertEquals("Buzz", fb.FizzBuzz(56));
		Assert.assertEquals("Buzz", fb.FizzBuzz(58));
	}
	
	@Test
	public void returns_original_number_if_number_is_not_FizzBuzz() {
		Assert.assertEquals("1", fb.FizzBuzz(1));
		Assert.assertEquals("2", fb.FizzBuzz(2));
		Assert.assertEquals("14", fb.FizzBuzz(14));
	}
	
	@Test
	public void returns_FizzBuzz_for_multiples_of_both_3_and_5() {
		Assert.assertEquals("FizzBuzz", fb.FizzBuzz(15));
		Assert.assertEquals("FizzBuzz", fb.FizzBuzz(45));
		Assert.assertEquals("FizzBuzz", fb.FizzBuzz(60));
	}
	
	@Test
	public void returns_FizzBuzz_if_contains_digits_3_and_5() {
		Assert.assertEquals("FizzBuzz", fb.FizzBuzz(53));
	}
}
