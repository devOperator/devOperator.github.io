package com.techelevator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
	
		System.out.println(System.getProperty("user.dir"));
		
		
		String path = "/Users/cbrown/cameronbrown-java-exercises/m1-w4d2-file-io-part1-exercises/test_quiz.txt";
		
		QuizMaker quiz = new QuizMaker();
		quiz.giveQuiz(path); 

	}
	
	public void giveQuiz(String path) {
		
		BufferedReader br = null;
		FileReader fr = null; 
		@SuppressWarnings("unused")
		int lineCt = 1;
		@SuppressWarnings("unused")
		String currentLine = null;
		List<String> questions = new ArrayList<String>();
		List<String> answers = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		
		try {

			fr = new FileReader(path);
			br = new BufferedReader(fr);

			while(((currentLine = br.readLine()) != null)) {
				answers.add(currentLine.substring((currentLine.lastIndexOf("|", currentLine.indexOf("*"))) + 1, 
						currentLine.indexOf("*"))); //finds last "|" before * and adds that value to answer list		
				
				currentLine = currentLine.replace("*", "");
				String[] qSplit = currentLine.split("\\|");
				lineCt++;
				
				for(String element : qSplit) {
					questions.add(element);
				}	
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		int j = 0; //question counter
		int correctCt = 0;
		boolean answered = false;
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		while(!answered) {
			for(int i = 0; i < questions.size(); i++) //index in question list counter
			/*for(String element : questions)*/ {
				if(j >= 1 && j <=4) {
					System.out.println(j + " " + questions.get(i));
					map.put(j++, questions.get(i));
				}else {
					System.out.println(questions.get(i));
					j = 1;
				}
				
				if(j == 5) {
					Integer answer = in.nextInt();
					if(answers.contains(map.get(answer))) {
						System.out.println("Your answer: " + answer); 
						System.out.println("Correct" + "\n");
						answered = true;
						correctCt++;
					}else if(answer > 4 || answer < 1) {
						System.out.println("Your answer: " + answer); 
						System.out.println("Invalid answer"+ "\n");
						i = i - 5; //goes back to the last question
						answered = false;
					}else {
						System.out.println("Your answer: " + answer); 
						System.out.println("Sorry that isn't correct"  + "\n");
						answered = true;
					}		
				}
			}
		}
		
		System.out.println("You got " + correctCt + " answer(s) correct out of the total " + 
		answers.size() + " questions asked");
		
		in.close();
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
}

