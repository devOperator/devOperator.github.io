package com.techelevator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordSearch {

	public static void main(String[] args) {

		String path = "/Users/cbrown/cameronbrown-java-exercises/m1-w4d3-file-io-part2-exercises/alices_adventures_in_wonderland.txt";
		
						
		
		WordSearch wordseer = new WordSearch();
		wordseer.search("Alice", path, false);
	}
	
	public void search(String word, String path, boolean caseSensitive){
		
		BufferedReader br = null;
		FileReader fr = null; 
		@SuppressWarnings("unused")
		int lineCt = 1;
		String currentLine = null;
		
		try {

			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			while(((currentLine = br.readLine()) != null)) {
		
				if(caseSensitive == false) {
					if(currentLine.contains(word) || currentLine.contains(word.toUpperCase()) || currentLine.contains(word.toLowerCase())) {
						System.out.println(lineCt + " " + currentLine);
					}
				}
				
				else if(currentLine.contains(word)) {
					System.out.println(lineCt + " " + currentLine);
				}
				lineCt++;
			}
		
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}
