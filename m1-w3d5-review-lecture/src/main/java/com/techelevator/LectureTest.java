package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class LectureTest {

	public static void main(String[] args) {
		

	}
	
	private void HashMapReview() {
		Map<String, String> zipToName = new HashMap<String, String>();
		
		zipToName.put("43201", "John");
		zipToName.put("90210", "Jane");
		zipToName.put("45012", "Sally");
		
		System.out.println(zipToName.get("90210"));
		
		for (String key : zipToName.keySet()) {
			System.out.println(key + " " + zipToName.get(key));
		}
	}

}
