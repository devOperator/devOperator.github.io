package com.techelevator;

public class hasBadTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Chocolate";
		String result = "";
		for(int i = 0; i < str.length(); i = i + 4) {
			if(i <= str.length() - 2) {
				result += str.substring(i, i + 2);
			}else if(i <= str.length() - 1){
				result += str.substring(i, i + 1);
			}
		}
		
		System.out.println(result);

	}
}
