package com.techelevator.person;

public class Person {

	//
	// Write code here
	//
	private String firstName;
	private String lastName;
	private int age;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	public static void main (String[] args) {
		
		
	} */
	public String getFullName() {
		return this.lastName + ", " + this.firstName;
	}
	
	public boolean isAdult() {
		return this.age >= 18? true: false;
			
	}
	
}
