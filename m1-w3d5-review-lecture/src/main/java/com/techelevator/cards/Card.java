package com.techelevator.cards;


public class Card {

	public static String[] Suits = new String[]{
		"DIAMONDS",
		"HEARTS",
		"SPADES",
		"CLUBS"
	};
	
	public static String[] Faces = new String[] {
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
	
	private int suit = 0;
	private int face = 0;
	
	public Card (int suit, int face) {
		setSuit(suit);
		setFace(face);
	}
	
	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getFace() {
		return face;
	}

	public void setFace(int face) {
		this.face = face;
	}
	
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
	

	public String toStringShortName() {
		return Suits[this.suit].substring(0,1) +this.face;
	}
	
	
	public static String getSuitName(int suit) {
		return Suits[suit];
	}
	
	public static String getFaceName(int face) {
		return Faces[face];
	}

}