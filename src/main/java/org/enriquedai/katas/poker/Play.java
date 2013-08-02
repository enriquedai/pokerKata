package org.enriquedai.katas.poker;

import java.util.Random;

public class Play {

	public static void main(String[] args) throws Exception {
		System.out.println(new PokerManager().showdown(generateRandomHand()));
	}

	private static Card[] generateRandomHand() {
		Card[] randomHand = new Card[Deck.NUMBER_OF_CARDS_IN_HAND];

		for(int i = 0; i < Deck.NUMBER_OF_CARDS_IN_HAND; i++) {
			randomHand[i] = Deck.DECK[new Random().nextInt(Deck.NUMBER_OF_CARDS_IN_DECK)];
		}

		return randomHand;
	}
}
