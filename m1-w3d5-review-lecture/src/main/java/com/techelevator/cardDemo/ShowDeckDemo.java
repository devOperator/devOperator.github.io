package com.techelevator.cardDemo;

import com.techelevator.cards.Card;
import com.techelevator.cards.Deck;

public class ShowDeckDemo {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		printDeck(deck);
		
		System.out.println();
		
		deck.resetDeck(Deck.ShuffleTechnique.method);
		printDeck(deck);
		
		System.out.println();
		
		deck.resetDeck(Deck.ShuffleTechnique.recursirve);
		printDeck(deck);

	}

	private static void printDeck(Deck deck) {
		while(!deck.getCardDeck().isEmpty()) {
			System.out.print(deck.getCardDeck().pop().toStringShortName() + " ");
		}
		System.out.println();
	}
	
}
