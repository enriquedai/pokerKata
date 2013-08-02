package org.enriquedai.katas.poker;

import org.enriquedai.katas.poker.types.CardNumber;
import org.enriquedai.katas.poker.types.CardSuit;

public class Deck {

	public static final int NUMBER_OF_CARDS_IN_DECK = 52;
	public static final int NUMBER_OF_CARDS_IN_HAND = 5;

	/* ----- DECK ----- */

	public static final Card twoOfHearts = new Card(CardSuit.HEARTS, CardNumber.TWO);
	public static final Card threeOfHearts = new Card(CardSuit.HEARTS, CardNumber.THREE);
	public static final Card fourOfHearts = new Card(CardSuit.HEARTS, CardNumber.FOUR);
	public static final Card fiveOfHearts = new Card(CardSuit.HEARTS, CardNumber.FIVE);
	public static final Card sixOfHearts = new Card(CardSuit.HEARTS, CardNumber.SIX);
	public static final Card sevenOfHearts = new Card(CardSuit.HEARTS, CardNumber.SEVEN);
	public static final Card eightOfHearts = new Card(CardSuit.HEARTS, CardNumber.EIGHT);
	public static final Card nineOfHearts = new Card(CardSuit.HEARTS, CardNumber.NINE);
	public static final Card tenOfHearts = new Card(CardSuit.HEARTS, CardNumber.TEN);
	public static final Card jackOfHearts = new Card(CardSuit.HEARTS, CardNumber.JACK);
	public static final Card queenOfHearts = new Card(CardSuit.HEARTS, CardNumber.QUEEN);
	public static final Card kingOfHearts = new Card(CardSuit.HEARTS, CardNumber.KING);
	public static final Card aceOfHearts = new Card(CardSuit.HEARTS, CardNumber.ACE);

	public static final Card twoOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.TWO);
	public static final Card threeOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.THREE);
	public static final Card fourOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.FOUR);
	public static final Card fiveOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.FIVE);
	public static final Card sixOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.SIX);
	public static final Card sevenOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.SEVEN);
	public static final Card eightOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.EIGHT);
	public static final Card nineOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.NINE);
	public static final Card tenOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.TEN);
	public static final Card jackOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.JACK);
	public static final Card queenOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.QUEEN);
	public static final Card kingOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.KING);
	public static final Card aceOfDiamonds = new Card(CardSuit.DIAMONDS, CardNumber.ACE);

	public static final Card twoOfClubs = new Card(CardSuit.CLUBS, CardNumber.TWO);
	public static final Card threeOfClubs = new Card(CardSuit.CLUBS, CardNumber.THREE);
	public static final Card fourOfClubs = new Card(CardSuit.CLUBS, CardNumber.FOUR);
	public static final Card fiveOfClubs = new Card(CardSuit.CLUBS, CardNumber.FIVE);
	public static final Card sixOfClubs = new Card(CardSuit.CLUBS, CardNumber.SIX);
	public static final Card sevenOfClubs = new Card(CardSuit.CLUBS, CardNumber.SEVEN);
	public static final Card eightOfClubs = new Card(CardSuit.CLUBS, CardNumber.EIGHT);
	public static final Card nineOfClubs = new Card(CardSuit.CLUBS, CardNumber.NINE);
	public static final Card tenOfClubs = new Card(CardSuit.CLUBS, CardNumber.TEN);
	public static final Card jackOfClubs = new Card(CardSuit.CLUBS, CardNumber.JACK);
	public static final Card queenOfClubs = new Card(CardSuit.CLUBS, CardNumber.QUEEN);
	public static final Card kingOfClubs = new Card(CardSuit.CLUBS, CardNumber.KING);
	public static final Card aceOfClubs = new Card(CardSuit.CLUBS, CardNumber.ACE);

	public static final Card twoOfSpades = new Card(CardSuit.SPADES, CardNumber.TWO);
	public static final Card threeOfSpades = new Card(CardSuit.SPADES, CardNumber.THREE);
	public static final Card fourOfSpades = new Card(CardSuit.SPADES, CardNumber.FOUR);
	public static final Card fiveOfSpades = new Card(CardSuit.SPADES, CardNumber.FIVE);
	public static final Card sixOfSpades = new Card(CardSuit.SPADES, CardNumber.SIX);
	public static final Card sevenOfSpades = new Card(CardSuit.SPADES, CardNumber.SEVEN);
	public static final Card eightOfSpades = new Card(CardSuit.SPADES, CardNumber.EIGHT);
	public static final Card nineOfSpades = new Card(CardSuit.SPADES, CardNumber.NINE);
	public static final Card tenOfSpades = new Card(CardSuit.SPADES, CardNumber.TEN);
	public static final Card jackOfSpades = new Card(CardSuit.SPADES, CardNumber.JACK);
	public static final Card queenOfSpades = new Card(CardSuit.SPADES, CardNumber.QUEEN);
	public static final Card kingOfSpades = new Card(CardSuit.SPADES, CardNumber.KING);
	public static final Card aceOfSpades = new Card(CardSuit.SPADES, CardNumber.ACE);

	public static final Card[] DECK = {
			twoOfHearts, threeOfHearts, fourOfHearts, fiveOfHearts, sixOfHearts, sevenOfHearts, eightOfHearts,
			nineOfHearts, tenOfHearts, jackOfHearts, queenOfHearts, kingOfHearts, aceOfHearts,

			twoOfDiamonds, threeOfDiamonds, fourOfDiamonds, fiveOfDiamonds, sixOfDiamonds, sevenOfDiamonds, eightOfDiamonds,
			nineOfDiamonds, tenOfDiamonds, jackOfDiamonds, queenOfDiamonds, kingOfDiamonds, aceOfDiamonds,

			twoOfClubs, threeOfClubs, fourOfClubs, fiveOfClubs, sixOfClubs, sevenOfClubs, eightOfClubs,
			nineOfClubs, tenOfClubs, jackOfClubs, queenOfClubs, kingOfClubs, aceOfClubs,

			twoOfSpades, threeOfSpades, fourOfSpades, fiveOfSpades, sixOfSpades, sevenOfSpades, eightOfSpades,
			nineOfSpades, tenOfSpades, jackOfSpades, queenOfSpades, kingOfSpades, aceOfSpades
	};

	/* ----- HANDS WITH CARDS ----- */

	public static final Card[] WRONG_HAND = { aceOfSpades };
	public static final Card[] HIGH_CARD = { threeOfClubs, fiveOfDiamonds, sevenOfHearts, nineOfSpades, aceOfSpades };
	public static final Card[] ONE_PAIR = { threeOfClubs, fiveOfDiamonds, sevenOfHearts, aceOfSpades, aceOfSpades };
	public static final Card[] TWO_PAIR = { threeOfClubs, sevenOfHearts, sevenOfHearts, aceOfSpades, aceOfSpades };
	public static final Card[] THREE_OF_A_KIND = { aceOfHearts, aceOfDiamonds, aceOfClubs, kingOfHearts, queenOfHearts };
	public static final Card[] STRAIGHT = { twoOfClubs, threeOfClubs, fourOfClubs, fiveOfSpades, sixOfHearts };
	public static final Card[] STRAIGHT_BEGIN_WITH_ACE = { aceOfSpades, twoOfClubs, threeOfClubs, fourOfClubs, fiveOfSpades };
	public static final Card[] FAKE_STRAIGHT = { kingOfClubs, aceOfSpades, twoOfHearts, threeOfDiamonds, fourOfClubs };
	public static final Card[] FLUSH = { twoOfHearts, fourOfHearts, sixOfHearts, eightOfHearts, aceOfHearts };
	public static final Card[] FULL_HOUSE = { aceOfHearts, aceOfDiamonds, aceOfClubs, queenOfDiamonds, queenOfHearts };
	public static final Card[] FOUR_OF_A_KIND = { aceOfHearts, aceOfDiamonds, aceOfClubs, aceOfSpades, queenOfHearts };
	public static final Card[] STRAIGHT_FLUSH = { twoOfClubs, threeOfClubs, fourOfClubs, fiveOfClubs, sixOfClubs };
	public static final Card[] ROYAL_FLUSH = { tenOfSpades, jackOfSpades, queenOfSpades, kingOfSpades, aceOfSpades };

}
