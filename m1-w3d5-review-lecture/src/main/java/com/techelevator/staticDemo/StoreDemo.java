package com.techelevator.staticDemo;

public class StoreDemo {

	private StoreRegister register1 = new StoreRegister();
	private StoreRegister register2 = new StoreRegister();
	private StoreRegister register3 = new StoreRegister();
	
	public void printAmounts() {
		System.out.println("Register 1 has " + register1.getRegisterMoney());
		System.out.println("Register 2 has " + register2.getRegisterMoney());
		System.out.println("Register 3 has " + register3.getRegisterMoney());
		System.out.println("The store has " + StoreRegister.getStoreMoney());
		
	}
	
	
	
	public StoreRegister getRegister1() {
		return register1;
	}



	public StoreRegister getRegister2() {
		return register2;
	}



	public StoreRegister getRegister3() {
		return register3;
	}



	public static void main(String[] args) {

		StoreDemo demo = new StoreDemo();
		
		System.out.println("The Store is OPEN!!!");
		System.out.println();
		
		System.out.println("Purchases made at Register 1 ($10.00) and 2 ($25.00)");
		demo.getRegister1().purchaseItemAtRegister(10.00d);
		demo.getRegister2().purchaseItemAtRegister(25.00d);
		demo.printAmounts();
		
		System.out.println();
		
		System.out.println("Purchases made at Register 1 ($5.00) and 2 ($150.00) and 3 ($17.00)");
		demo.getRegister1().purchaseItemAtRegister(5.00d);
		demo.getRegister2().purchaseItemAtRegister(150.00d);
		demo.getRegister3().purchaseItemAtRegister(17.00d);
		demo.printAmounts();
		
		System.out.println();
		
		System.out.println("Purchases made at Register 3 ($60.00)");
		demo.getRegister3().purchaseItemAtRegister(60.00d);
		demo.printAmounts();
		
		System.out.println();
		System.out.println("The Store is CLOSED!!!");
		System.out.println("The final counts:");
		demo.printAmounts();
	}

}
