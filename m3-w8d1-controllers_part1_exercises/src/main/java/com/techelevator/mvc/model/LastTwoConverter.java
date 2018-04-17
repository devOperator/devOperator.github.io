package com.techelevator.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class LastTwoConverter {

	public LastTwoConverter(String word1, String word2, String word3, String word4, String word5, String word6,
			String word7, String word8, String word9, String word10) {
		super();
		this.word1 = word1;
		this.word2 = word2;
		this.word3 = word3;
		this.word4 = word4;
		this.word5 = word5;
		this.word6 = word6;
		this.word7 = word7;
		this.word8 = word8;
		this.word9 = word9;
		this.word10 = word10;
	}


	public String getWord1() {
		return word1;
	}


	public void setWord1(String word1) {
		this.word1 = word1;
	}


	public String getWord2() {
		return word2;
	}


	public void setWord2(String word2) {
		this.word2 = word2;
	}


	public String getWord3() {
		return word3;
	}


	public void setWord3(String word3) {
		this.word3 = word3;
	}


	public String getWord4() {
		return word4;
	}


	public void setWord4(String word4) {
		this.word4 = word4;
	}


	public String getWord5() {
		return word5;
	}


	public void setWord5(String word5) {
		this.word5 = word5;
	}


	public String getWord6() {
		return word6;
	}


	public void setWord6(String word6) {
		this.word6 = word6;
	}


	public String getWord7() {
		return word7;
	}


	public void setWord7(String word7) {
		this.word7 = word7;
	}


	public String getWord8() {
		return word8;
	}


	public void setWord8(String word8) {
		this.word8 = word8;
	}


	public String getWord9() {
		return word9;
	}


	public void setWord9(String word9) {
		this.word9 = word9;
	}


	public String getWord10() {
		return word10;
	}


	public void setWord10(String word10) {
		this.word10 = word10;
	}


	String word1;
	String word2;
	String word3;
	String word4;
	String word5;
	String word6;
	String word7;
	String word8;
	String word9;
	String word10;
	
	
	
	public List<String> getListOfWords(){
		
		
		List<String> ListOfWords = new ArrayList<>();

		ListOfWords.add(word1);
		ListOfWords.add(word2);
		ListOfWords.add(word3);
		ListOfWords.add(word4);
		ListOfWords.add(word5);
		ListOfWords.add(word6);
		ListOfWords.add(word7);
		ListOfWords.add(word8);
		ListOfWords.add(word9);
		ListOfWords.add(word10);
		
		return ListOfWords;	
	}
	
	
	public List<String> getConvertedWords() {
		
		List<String> convertedWordList = new ArrayList<>();

		for(String word : getListOfWords()) {
			if(word.length() > 1) {
				String tempWord1 = word.substring(0,word.length() - 2);
				String tempWord2 = tempWord1 + word.substring(word.length() - 1, word.length());
				String reOrdered = tempWord2 + word.substring(word.length() - 2, word.length() - 1);
				convertedWordList.add(reOrdered);				
//				convertedWordList.add("dog");
			}
			
			else {
				
				convertedWordList.add(word);
//				convertedWordList.add("cat");

			}
		}
		
		return convertedWordList;
				
	}
	
	
}
