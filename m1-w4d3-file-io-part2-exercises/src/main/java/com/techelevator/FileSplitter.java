package com.techelevator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileSplitter {

	public static void main(String[] args) {
			
		FileSplitter fs = new FileSplitter();
		try {
			fs.splitFile(args[0], Integer.parseInt(args[1]));
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User must input path and line limit size");
			System.exit(300);
		}
		
		fs.splitFile(args[0], Integer.parseInt(args[1]));		
	}
	
	public void splitFile(String path, int limit){
		BufferedReader br = null;
		FileReader fr = null; 
		@SuppressWarnings("unused")
		int lineCt = 1;
		@SuppressWarnings("unused")
		String currentLine = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		Integer fileNum = 2;
		
		try {
	
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			fw = new FileWriter("Text-1");
			bw = new BufferedWriter(fw);
		
			while(((currentLine = br.readLine()) != null)) {			
				if(lineCt < limit){
					bw.append(currentLine);
					lineCt++;
				}else {
					lineCt = 1;	
					fw = new FileWriter("Text-" + fileNum.toString());
					bw = new BufferedWriter(fw);
					fileNum++;
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Invalid User input");
			System.exit(300);
		}
	
		try {
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

