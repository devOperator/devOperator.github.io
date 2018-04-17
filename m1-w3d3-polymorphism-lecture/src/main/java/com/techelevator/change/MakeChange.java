package com.techelevator.change;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeChange {

	private static final Coin[] coins = new Coin[] { 
			new FiftyCent(), new Quarter(), new Dime(), new Nickel() };
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Amount to make change for (no pennies returned)?");
		int amount = (int)(Double.parseDouble(in.nextLine()) * 100);
		
		Map<Coin, Integer> change = new HashMap<Coin, Integer>();
		
		for (Coin coin : coins) {
			if (amount <= 0) { break; }
			int cnt = amount / coin.getValue();
			if (cnt > 0) {
				amount = amount % (coin.getValue() * cnt);
				change.put(coin, cnt);
			}
		}
		
		for (Coin coin : change.keySet()) {
			System.out.println(change.get(coin) + " " + coin.getName() + "(s)");
		}
		
	}

}
