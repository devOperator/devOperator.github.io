package com.techelevator.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck {
	
	public enum ShuffleTechnique {
		collection,
		method,
		recursirve
	}
	
	private Stack<Card> cardDeck = new Stack<Card>();
	private ShuffleMachine shuffleMachine = new ShuffleMachine();
	
	
	public Deck() {
		resetDeck();
	}
	
	public Stack<Card> getCardDeck() {
		return this.cardDeck;
	}
	
	public Card dealCard() {
		// If the deck is empty build a new one
		if (cardDeck.isEmpty()) {
			resetDeck();
		}
		return cardDeck.pop();
		
	}
	
	public int getRemainingCardCount() {
		return cardDeck.size();
	}
	
	public void resetDeck() {
		buildDeck(ShuffleTechnique.collection);
	}
	public void resetDeck(ShuffleTechnique shuffle) {
		buildDeck(shuffle);
	}
	
	
	private void buildDeck(ShuffleTechnique shuffle) {
		
		List<Card> deck = new ArrayList<Card>();
		for (int suit = 0; suit < Card.Suits.length; suit++) {
			for (int face = 0; face < Card.Faces.length; face++){
				deck.add(new Card(suit, face));
			}
		}
		
	
		if (shuffle == ShuffleTechnique.method) {
			System.out.println("Shuffling using a regular method!");
			deck = shuffleMachine.shuffleWithArrayReplacement(deck);
		} else if (shuffle == ShuffleTechnique.recursirve) {
			System.out.println("Shuffling using a recursive method!");
			Card[] cards = deck.toArray(new Card[deck.size()]);
			shuffleMachine.shuffleRecursively(cards, 52);
			deck = (List<Card>)Arrays.asList(cards);
		}
		else {
			System.out.println("Shuffling using the Collections class");
			shuffleMachine.shuffleWithCollectionsShuffle(deck);
		}
		
		for (Card card : deck) {
			cardDeck.push(card);
		}
	}
	
	
	

}
