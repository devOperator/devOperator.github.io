package com.techelevator.mvc.model;

public class OrderedResultConverter {
		
	private String firstName;
	private String lastName;
	private String MI;
	private String orderChoice;
	

	public OrderedResultConverter(String firstName, String lastName, String MI, String orderChoice){
		this.firstName = firstName;
		this.lastName = lastName;
		this.MI = MI;
		this.orderChoice = orderChoice;
	}
	
	public OrderedResultConverter(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public String getOrderName() {
		String result = "";
		if(orderChoice.equals("option4")) {
			result = lastName + ", " + firstName;	
		}
		else if(orderChoice.equals("option3")) {
			result = lastName + ", " + firstName + " " + MI;		
				}
		else if(orderChoice.equals("option2")) {
			result = firstName + " " + lastName;
		}
		else if(orderChoice.equals("option1")) {
			result = firstName + " " + MI + " " + lastName;
		}
		return result;
	}


}
