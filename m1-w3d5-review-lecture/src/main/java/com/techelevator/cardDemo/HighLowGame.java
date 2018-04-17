package com.techelevator.cardDemo;

import java.io.PrintStream;
import java.util.Scanner;

import com.techelevator.cards.Card;
import com.techelevator.cards.Deck;

public class HighLowGame {

	private Scanner in = new Scanner(System.in);
	private PrintStream out = System.out;
	private int playerOneWins = 0;
	private int playerTwoWins = 0;
	private int ties = 0;
	private Deck deck;
	
	public void play() {
		
		deck = new Deck();

		out.println("****** Welcome to High/Low ******");
		
		
		while (true) {
			
			out.println();
			out.println("(P)lay or (Q)uit");
		
			String choice = in.nextLine().toUpperCase();
			
			if (choice.equals("Q")) {
				out.println("Thank you for playing!");
				out.println();
				out.println("Final Score:");
				showScore();
			} else if (!choice.equals("P")) {
				out.println("Invalid Choice!");
			}
			
			playRound();
			
		}

	}
	
	private void playRound() {
		if (deck.getRemainingCardCount() < 2) {
			deck.resetDeck();
		}
		Card playerOneCard = deck.dealCard();
		Card playerTwoCard = deck.dealCard();
		
		out.println("Player One has a " + playerOneCard);
		out.println("Player Two has a " + playerTwoCard);
		
		if (playerOneCard.getValue() == playerTwoCard.getValue()) {
			this.ties++;
			out.println("TIE!");
		} else if (playerOneCard.getValue() > playerTwoCard.getValue()) {
			this.playerOneWins++;
			out.println("Player One Wins!");
		} else {
			this.playerTwoWins++;
			out.println("Player Two Wins!");
		}
		showScore();
	}
	
	private void showScore() {
		out.println();
		out.print("Score: ");
		out.print("Player One: " + playerOneWins);
		out.print(" Player Two: " + playerTwoWins);
		out.println(" Ties: " + ties);
	}

}
