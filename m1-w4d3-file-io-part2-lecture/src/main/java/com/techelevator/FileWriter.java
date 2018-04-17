package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriter {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner in = new Scanner(System.in);
		
		String basepath = "/Users/brianlauvray/";
		
		String newDir = basepath + "fileWriter";
		
		// Create Directory
		File dirFileObj = new File(newDir);
		
		if (dirFileObj.exists() == false) {
			dirFileObj.mkdir();
		}
		
		String newFilePath = newDir + "/fileWriterFile";
		
		// Create a File
		File fileFileObj = new File(newFilePath);
		
		if (fileFileObj.exists() == false) {
			try {
				fileFileObj.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		// Delete a File
		System.out.println("Should we delete " + fileFileObj.getAbsolutePath() + "?");
		String yn = in.nextLine().toUpperCase();
		if (yn.equals("Y")) {
			fileFileObj.delete();
		}
		
		String message = "Line ";
		
		// Write to file with PrintWriter
		try (PrintWriter writer = new PrintWriter(fileFileObj)) {
			
			for (int i = 0; i <= 100; i++) {
				writer.println(message + i);
			}
			
			writer.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(fileFileObj))) {
			
			for (int i = 0; i <= 50; i++) {
				bufferedWriter.write("This is line " + i + "\n");
			}
			
			bufferedWriter.flush();
			
		}
		
		try ( java.io.FileWriter fileWriter = new java.io.FileWriter(fileFileObj.getAbsoluteFile(), true);
			BufferedWriter bufferedFileWriter = new BufferedWriter(fileWriter);	
		) {
			for (int i = 0; i <= 50; i++) {
				bufferedFileWriter.write("Appending " + i + "\n");
			}
			
			bufferedFileWriter.flush();
			
		}
		
	}

}
