package com.techelevator.mvc.model;

public class NameColorizer {

	private String firstName;
	private String lastName;
	private String red;
	private String blue;
	private String green;
	

	public NameColorizer(String firstName, String lastName, String red, String blue, String green){
		this.firstName = firstName;
		this.lastName = lastName;
		this.red = red;
		this.blue = blue;
		this.green = green;
	}
		
//	public String getColorizedName() {
//		String result = "";
//		if(red!=null) {
//			result = "r";	
//		}
//		if(blue!=null) {
//			result += "b";
//		}
//		if(green!=null) {
//			result += "g";
//		}
//	
//		
//		return red;
//	}
	
}
