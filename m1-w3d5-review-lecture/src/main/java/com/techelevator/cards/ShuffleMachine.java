package com.techelevator.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleMachine {

	Random rnd = new Random();
	
	public void shuffleWithCollectionsShuffle(List<Card> deck) {
		Collections.shuffle(deck);
	}
	
	public List<Card> shuffleWithArrayReplacement(List<Card> deck) {
		
		int low = 0;
		int high = 51;

		Card[] cards = deck.toArray(new Card[deck.size()]);
	
		for (int i = 0; i < cards.length; i++) {
			int j = rnd.nextInt(high - low) + low;
			Card temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}

		return (List<Card>)Arrays.asList(cards);
	}

	public void shuffleRecursively(Card[] cards, int n) {
		if ( n <= 1) {
			return;
		}
		int i = rnd.nextInt(n-1);
		Card temp = cards[n-1];
		cards[n-1] = cards[i];
		cards[i] = temp;
		
		shuffleRecursively(cards, n-1);
	}
	

	
}
