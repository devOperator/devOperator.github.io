package com.techelevator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FizzWriter {

	public static void main(String[] args) {
			
		FizzWriter fizzScripter = new FizzWriter();
		String path = "FizzBuzz.txt";
			fizzScripter.writeFizz(path);
	}
	
	public void writeFizz(String path){
		@SuppressWarnings("unused")
		Integer ct = 1;
		@SuppressWarnings("unused")
		String currentLine = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);
			bw.flush();
			fw.flush();
			while(ct <= 300) {
				if(ct % 3 == 0 && ct % 5 == 0) {
					currentLine = "FizzBuzz";
				}else if(ct % 3 == 0) {
					currentLine = "Fizz";
				}else if(ct % 5 == 0) {
					currentLine = "Buzz";
				}else {
					currentLine = ct.toString();
				}
				bw.append(currentLine + "\n");
				ct++;
			}
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Invalid User input");
			System.exit(300);
		}		
		finally {
			//fw.flush();
			try {
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
}

