package com.techelevator.staticDemo;

public class StoreRegister {

	private static double storeMoney = 0.0d;
	private double registerMoney = 0.0d;
	
	public static double getStoreMoney() {
		return storeMoney;
	}
	
	public void purchaseItemAtRegister(double cash) {
		this.registerMoney += cash;
		storeMoney += cash;
	}
		
	public double getRegisterMoney() {
		return this.registerMoney;  // the non-static does use this, since it is unique for each individual object from this class
	}
	

}
