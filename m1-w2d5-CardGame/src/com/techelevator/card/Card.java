package com.techelevator.card;

public class Card {
	
	public static final String[] Suits = new String[]{
			"DIAMONDS",
			"HEARTS",
			"SPADES",
			"CLUBS"
		};
		
		public static final String[] Faces = new String[] {
			"ACE",
			"TWO",
			"THREE",
			"FOUR",
			"FIVE",
			"SIX",
			"SEVEN",
			"EIGHT",
			"NINE",
			"TEN",
			"JACK",
			"QUEEN",
			"KING"
		};
		
		private int face;
		private int suit;
		
		public Card(int suit, int face) {
			this.suit = suit;
			this.face = face;
		}
		
		public static String getSuitName(int suit) {
			return Suits[suit];
		}
		
		public static String getFaceName(int face) {
			return Faces[face];		}
		
		public int getValue() {
			if (this.face == 0) {
				return 14;
			}
			return this.face;
		}
		
		@Override
		public String toString() {
			return Faces[this.face] + " of " + Suits[this.suit];
		}
		
		@Override
		public boolean equals(Object obj) {
			Card c = (Card) obj;
			return (this.face == c.getFace() && this.suit == c.getSuit());
		}
		
		
		public int getFace() {
			return face;
		}
		public void setFace(int face) {
			this.face = face;
		}
		public int getSuit() {
			return suit;
		}
		public void setSuit(int suit) {
			this.suit = suit;
		}

}
