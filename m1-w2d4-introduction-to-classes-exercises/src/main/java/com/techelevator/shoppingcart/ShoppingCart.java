package com.techelevator.shoppingcart;

public class ShoppingCart {

	//
	// Write code here
	//
	
	private int totalNumberOfItems = 0;
	private double totalAmountOwed = 0.0;
	
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}

	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}

	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}

	/*
	public static void main (String[] args) {
	ShoppingCart sc = new ShoppingCart();	
		sc.setTotalAmountOwed(110);
		sc.setTotalNumberOfItems(0);
		System.out.println("Avg PPI " + sc.getAveragePricePerItem());
	} */
	
	public double getAveragePricePerItem() {
		double averagePPI;
		if (this.totalNumberOfItems == 0) {
			averagePPI = 0;
		}else{
			averagePPI = this.totalAmountOwed / this.totalNumberOfItems;
		}
		return averagePPI;
	}
	public void addItems(int numberOfItems, double pricePerItem) {
		this.totalNumberOfItems += numberOfItems;
		this.totalAmountOwed += numberOfItems * pricePerItem;
	}
	public void empty() {
		this.totalAmountOwed = 0.0;
		this.totalNumberOfItems = 0;
	}
	
}
