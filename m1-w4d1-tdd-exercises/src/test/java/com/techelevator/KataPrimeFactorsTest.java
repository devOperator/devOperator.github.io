package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Arrays;

public class KataPrimeFactorsTest {
	
	KataPrimeFactors kpf;
	
	@Before
	public void setup() {
		kpf = new KataPrimeFactors();
	}
	
	@Test
	public void find_the_prime_factorization_of_two() {
		int[] twoArray = new int[] {2};
		Assert.assertTrue("", Arrays.equals(twoArray, (kpf.factorize(2)))); 
	}
	@Test
	public void find_the_prime_factorization_of_three() {
		int[] threeArray = new int[] {3};
		Assert.assertTrue("", Arrays.equals(threeArray, (kpf.factorize(3)))); 
	}
	
	@Test
	public void find_the_prime_factorization_of_five() {
		int[] fiveArray = new int[] {5};
		Assert.assertTrue("", Arrays.equals(fiveArray, kpf.factorize(5))); 
	} 
	
	@Test
	public void find_the_prime_factorization_of_seven() {
		int[] sevenArray = new int[] {7};
		Assert.assertTrue("", Arrays.equals(sevenArray, kpf.factorize(7))); 
	}
	
	@Test
	public void find_the_prime_factorization_of_twenty_five() {
		int[] array25 = new int[] {5,5};
		Assert.assertTrue("", Arrays.equals(array25,kpf.factorize(25))); 
	}
	
	@Test
	public void find_the_prime_factorization_of_thirty_two() {
		int[] array32 = new int[] {2,2,2,2,2};
		Assert.assertTrue("", Arrays.equals(array32,kpf.factorize(32))); 
	}
	
	@Test
	public void find_the_prime_factorization_of_twenty_seven() {
		int[] array27 = new int[] {3,3,3};
		Assert.assertTrue("", Arrays.equals(array27,kpf.factorize(27))); 
	} 
	@Test
	public void find_the_prime_factorization_of_seventy_two() {
		int[] array27 = new int[] {2,2,2,3,3};
		Assert.assertTrue("", Arrays.equals(array27,kpf.factorize(72))); 
	} 
	@Test
	public void find_the_prime_factorization_of_one_fourty_four() {
		int[] array27 = new int[] {2,2,2,2,3,3};
		Assert.assertTrue("", Arrays.equals(array27,kpf.factorize(144))); 
	} 
}
