package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class peterPaulTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//[\"hixxhi\", \"xaxxaxaxx\", \"axxxaaxx\"]
//		output = exercises.last2Revisted(new String[]{ "banana", "kiwi", "Hahahahaha" });
/*
		String[] words = new String[] {"banana", "kiwi", "Hahahahaha"};
		Map<String, Integer> wordLastTwo = new HashMap<String,Integer>();
		for(int i = 0; i < words.length; i ++) { //for the word
				for(int j = 0; j < words[i].length() - 2; j++) { //for the characters in the 
				if(words[i].substring(j, j + 2).equals(words[i].substring(words[i].length() - 2, words[i].length()))) {
					if(wordLastTwo.containsKey(words[i])) {
						wordLastTwo.put(words[i], wordLastTwo.get(words[i]) + 1);
					}else {
						wordLastTwo.put(words[i], 1);
					}
				}  
			} if(!wordLastTwo.containsKey(words[i])) {
				wordLastTwo.put(words[i], 0);
			}
		}
		
		System.out.println(wordLastTwo.get("banana"));
		System.out.println(wordLastTwo.size()); */

		/*Map<String, Integer> inventory1 = new HashMap<>();
		inventory1.put("SKU1", 100);
		inventory1.put("SKU2", 53);
		inventory1.put("SKU3", 44);
		
		Map<String, Integer> inventory2 = new HashMap<>();
		inventory2.put("SKU2", 11);
		inventory2.put("SKU4", 5);*/
		
		
		Map<String, Integer> consolidated = new HashMap<String,Integer>();
		Map<String, Integer> mainWarehouse = new HashMap<String,Integer>();
		mainWarehouse.put("SKU1", 100);
		mainWarehouse.put("SKU2", 53);
		mainWarehouse.put("SKU3", 44);
		
		Map<String, Integer> remoteWarehouse = new HashMap<String,Integer>();
		remoteWarehouse.put("SKU2", 11);
		remoteWarehouse.put("SKU4", 5);
		
		//wordMap.putAll(wordMap2);
		consolidated.putAll(mainWarehouse);
		consolidated.putAll(remoteWarehouse);
		
		if(mainWarehouse.size() > remoteWarehouse.size()) {
			for(String sku : consolidated.keySet()) {
				if(remoteWarehouse.containsKey(sku) && mainWarehouse.containsKey(sku) ){
					consolidated.put(sku, remoteWarehouse.get(sku) + mainWarehouse.get(sku));
				}
			}
		}
			
		System.out.println(consolidated.size());
		
	}

}
