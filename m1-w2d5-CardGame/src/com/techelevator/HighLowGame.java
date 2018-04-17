package com.techelevator;

import java.io.PrintStream;
import java.util.Scanner;

import com.techelevator.card.Card;
import com.techelevator.card.Deck;

public class HighLowGame {

	private Scanner in = new Scanner(System.in);
	private PrintStream out = System.out;
	
	private int playerOneWins = 0;
	private int playerTwoWins = 0;
	private int ties = 0;
	
	private Deck deck;
	
	public void play() {
		
		deck = new Deck();
		
		out.println("***** Welcome to High/Low *****");
		
		while (true) {
			
			out.println();
			out.println("(P)lay or (Q)uit");
			
			String choice = in.nextLine().toUpperCase();
			
			if (choice.equals("Q")) {
				out.println("Thank you for playing!");
				out.println();
				out.println("Final Score:");
				showScore();
				break;
			} else if (!choice.equals("P")) {
				out.println("Invalid Choice!");
				continue;
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
		
		out.println("Player one card: " + playerOneCard);
		out.println("Player two card: " + playerTwoCard);
		
		if (playerOneCard.getValue() == playerTwoCard.getValue()) {
			// Tie
			this.ties++;
			out.println("TIE!");
		} else if (playerOneCard.getValue() > playerTwoCard.getValue()) {
			// Player One Wins
			this.playerOneWins++;
			out.println("PLAYER ONE WINS!");
		} else {
			// Player Two Wins
			this.playerTwoWins++;
			out.println("PLAYER TWO WINS!");
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
