package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> map = new HashMap<String,String>();
		
		switch (animalName.toUpperCase()) {
		case "RHINO":
			map.put(animalName, "Crash");
			break;
		case "GIRAFFE":
			map.put(animalName, "Tower");
			break;	
		case "ELEPHANT":
			map.put(animalName, "Herd");
			break;
		case "LION":
			map.put(animalName, "Pride");
			break;
		case "CROW":
			map.put(animalName, "Murder");
			break;
		case "PIGEON":
			map.put(animalName, "Kit");
			break;
		case "FLAMINGO":
			map.put(animalName, "Pat");
			break;
		case "DEER":
			map.put(animalName, "Herd");
			break;
		case "DOG":
			map.put(animalName, "Pack");
			break;
		case "CROCODILE":
			map.put(animalName, "Float");	
			break;
		default :
			map.put(animalName, "unknown");
		}
		
		
		return map.get(animalName);
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		Map<String, Double> map = new HashMap<String,Double>();
		
		switch (itemNumber.toUpperCase()) {
		case "KITCHEN4001":
			map.put(itemNumber, .20);
			break;
		case "GARAGE1070":
			map.put(itemNumber, .15);
			break;	
		case "LIVINGROOM":
			map.put(itemNumber, .10);
			break;
		case "KITCHEN6073":
			map.put(itemNumber, .40);
			break;
		case "BEDROOM3434":
			map.put(itemNumber, .60);
			break;
		case "BATH0073":
			map.put(itemNumber, .15);
			break;
		default :
			map.put(itemNumber, 0.00);
		}
				
		return map.get(itemNumber);

	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
	
		if(peterPaul.get("Peter") > 0 && peterPaul.get("Paul") < 1000) {
			peterPaul.put("Paul", Math.round(peterPaul.get("Peter") / 2) + peterPaul.get("Paul"));
			peterPaul.put("Peter", peterPaul.get("Peter") - Math.round(peterPaul.get("Peter") / 2));
		}
		return peterPaul;
	}
	
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		Map<String, Double> map = new HashMap<String,Double>();

		if(peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
			peterPaul.put("PeterPaulPartnership", (peterPaul.get("Peter") + peterPaul.get("Paul")) / 4);
			peterPaul.put("Peter", (peterPaul.get("Peter") * 3) / 4);
			peterPaul.put("Paul", (peterPaul.get("Paul") * 3) / 4);
		}
		return peterPaul;
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> wordMap = new HashMap<String,String>();
		for(String word: words) {
			wordMap.put(word.substring(0,1), word.substring(word.length() - 1, word.length()));
		}
		return wordMap;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> wordMap = new HashMap<String,Integer>();
		for(String word : words) {
			if(wordMap.containsKey(word)){
				wordMap.put(word, (wordMap.get(word) + 1));
			}else {
				wordMap.put(word, 1);
			}
		}
		return wordMap;
	}
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();

		for(int number : ints) {
			if(numMap.containsKey(number)){
				numMap.put(number, (numMap.get(number) + 1));
			}else {
				numMap.put(number, 1);
			}
		}
		return numMap;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		
		Map<String, Integer> letterMap = new HashMap<String, Integer>();
		Map<String, Boolean> letterMap2 = new HashMap<String, Boolean>();

		for(String word : words) {
			if(letterMap.containsKey(word)){
				letterMap.put(word, (letterMap.get(word) + 1));
			}else {
				letterMap.put(word, 1);
			}
		}
		for(String letter : letterMap.keySet()) {
			if(letterMap.get(letter) >=2 ){
				letterMap2.put(letter, true);
			}else {
				letterMap2.put(letter, false);
			}
		}
		
		return letterMap2;
	}
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> consolidated = new HashMap<String,Integer>();
		consolidated.putAll(mainWarehouse);
		consolidated.putAll(remoteWarehouse);
		
		for(String sku : consolidated.keySet()) {
			if(remoteWarehouse.containsKey(sku) && mainWarehouse.containsKey(sku) ){
				consolidated.put(sku, remoteWarehouse.get(sku) + mainWarehouse.get(sku));
			}
		}
					
		return consolidated;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		
		Map<String, Integer> wordLastTwo = new HashMap<String,Integer>();
		for(int i = 0; i < words.length; i ++) { //loop through arrays
				for(int j = 0; j < words[i].length() - 2; j++) { //loop through characters of word from the array
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
		
		return wordLastTwo;
	}
}









