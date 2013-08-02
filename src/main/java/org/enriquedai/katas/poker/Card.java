package org.enriquedai.katas.poker;

import org.enriquedai.katas.poker.types.CardNumber;
import org.enriquedai.katas.poker.types.CardSuit;

public class Card {

	private CardSuit suit;
	private CardNumber number;

	public Card(CardSuit suit, CardNumber number) {
		this.suit = suit;
		this.number = number;
	}

	public CardSuit getSuit() {
		return suit;
	}

	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}

	public CardNumber getNumber() {
		return number;
	}

	public void setNumber(CardNumber number) {
		this.number = number;
	}

}
