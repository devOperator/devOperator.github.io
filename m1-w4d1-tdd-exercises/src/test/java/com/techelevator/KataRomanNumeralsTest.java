package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	
	KataRomanNumerals krn;
	
	@Before
	public void setup() {
		krn = new KataRomanNumerals(); 
	}
	
	@Test
	public void convert_numeral_to_two_digit_number() {
		//System.out.println(krn.romanToNewConverter("I"));
		Assert.assertTrue("", 1 == (krn.romanToNewConverter("I")));
	}
	
	
	@Test
	public void convert_numeral_to_three_digit_number()  {
		System.out.println(krn.romanToNewConverter("XII"));
		Assert.assertTrue("", 12 == (krn.romanToNewConverter("XII")));
	} 
	
	@Test
	public void convert_numeral_to_four_digit_number()  {
		System.out.println(krn.romanToNewConverter("CXV"));
		Assert.assertTrue("", 115 == (krn.romanToNewConverter("CXV")));
	}
	
	@Test
	public void convert_numeral_to_five_digit_number() {
		System.out.println(krn.romanToNewConverter("MCXI"));
		Assert.assertTrue("", 1111 == (krn.romanToNewConverter("MCXI")));
	}
	
	@Test
	public void convert_special_case_numeral_to_number() {
		System.out.println(krn.romanToNewConverter("XIV"));
		Assert.assertTrue("", 14 == (krn.romanToNewConverter("XIV")));
	}
	
	@Test
	public void convert_larger_special_case_numeral_to_number() {
		System.out.println(krn.romanToNewConverter("CMXIV"));
		Assert.assertTrue("", 914 == (krn.romanToNewConverter("CMXIV")));
	}
	
	@Test
	public void convert_larger_yet_special_case_numeral_to_number() {
		System.out.println(krn.romanToNewConverter("MCMXCI"));
		Assert.assertTrue("", 1991 == (krn.romanToNewConverter("MCMXCI")));
	}
	
	
	
	
	
	@Test
	public void convert_normal_to_single_character_numeral() {
		System.out.println(krn.newToRomanConverter(5));
		Assert.assertTrue("", "V".equals(krn.newToRomanConverter(5)));
	}
	
	@Test
	public void convert_number_double_character_numeral() {
		System.out.println(krn.newToRomanConverter(110));
		Assert.assertTrue("", "CX".equals(krn.newToRomanConverter(110)));
	}

	@Test
	public void convert_numeral_to_four_digit_roman_numeral() {
		System.out.println(krn.newToRomanConverter(1111));
		Assert.assertTrue("", "MCXI".equals(krn.newToRomanConverter(1111)));
	} 
	
	@Test
	public void convert_number_to_numeral_that_could_exceed_four_characters() {
		System.out.println(krn.newToRomanConverter(90));
		Assert.assertTrue("", "XC".equals(krn.newToRomanConverter(90)));
	} 
	
	

}
