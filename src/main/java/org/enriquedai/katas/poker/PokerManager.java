package org.enriquedai.katas.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.enriquedai.katas.poker.types.CardNumber;
import org.enriquedai.katas.poker.types.CardSuit;
import org.enriquedai.katas.poker.types.WinningHand;

public class PokerManager {

	/* ----- LOGIC METHOD ----- */

	public WinningHand showdown(Card[] hand) throws Exception {
		if(hand.length != Deck.NUMBER_OF_CARDS_IN_HAND) {
			throw new Exception("Wrong amount of cards in hand");
		}

		// Check winning hands from best option to worst

		if(checkStraight(hand) && checkSuitedHand(hand) && checkAceInHand(hand)) {
			return WinningHand.ROYAL_FLUSH;
		} else if(checkStraight(hand) && checkSuitedHand(hand)) {
			return WinningHand.STRAIGHT_FLUSH;
		} else if(checkFourOfAKind(hand)) {
			return WinningHand.FOUR_OF_A_KIND;
		} else if(checkThreeOfAKind(hand) && checkTwoOfAKind(hand)) {
			return WinningHand.FULL_HOUSE;
		} else if(checkSuitedHand(hand)) {
			return WinningHand.FLUSH;
		} else if(checkStraight(hand)) {
			return WinningHand.STRAIGHT;
		} else if(checkThreeOfAKind(hand)) {
			return WinningHand.THREE_OF_A_KIND;
		} else if(checkTwoPair(hand)) {
			return WinningHand.TWO_PAIR;
		} else if(checkTwoOfAKind(hand)) {
			return WinningHand.ONE_PAIR;
		} else {
			return WinningHand.HIGH_CARD;
		}

	}

	/* ----- HELPER FUNCTIONS to check combinations ----- */

	public boolean checkStraight(Card[] hand) {
		Map<CardNumber, Integer> numberMap = fillNumberMap(hand);
		// Remove the zero-valued entries in the map
		Map<CardNumber, Integer> numberMapFiltered = new HashMap<CardNumber, Integer>();
		for(Entry<CardNumber, Integer> entry : numberMap.entrySet()) {
			if(entry.getValue() != 0) {
				numberMapFiltered.put(entry.getKey(), entry.getValue());
			}
		}

		Set<CardNumber> cardNumbers = numberMapFiltered.keySet();
		// Check if all are different numbers
		if(cardNumbers.size() < 5) {
			return false;
		}

		// Extract ciphers
		List<Integer> cardNumberCiphers = new ArrayList<Integer>();
		for(CardNumber cardNumber : cardNumbers) {
			cardNumberCiphers.add(cardNumber.getCipher());
		}

		// Order asc
		Collections.sort(cardNumberCiphers);

		// Check possibility of low straight with ace
		if(cardNumberCiphers.contains(CardNumber.ACE.getCipher()) && cardNumberCiphers.contains(CardNumber.TWO.getCipher())) {
			// turn the ace high cipher(14) into the low one (1) (to calculate low straight)
			cardNumberCiphers.remove(new Integer(CardNumber.ACE.getCipher()));
			cardNumberCiphers.add(1);
			Collections.sort(cardNumberCiphers);
		}

		// Check correlative ciphers for straight
		for(int i = 0; i < cardNumberCiphers.size() - 1; i++) {
			// last card
			if(i == cardNumberCiphers.size() - 1) {
				if(cardNumberCiphers.get(i) - 1 != cardNumberCiphers.get(i - 1)) {
					return false;
				}
			}
			// normal card
			else {
				if(cardNumberCiphers.get(i) + 1 != cardNumberCiphers.get(i + 1)) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean checkSuitedHand(Card[] hand) {
		return fillSuitMap(hand).containsValue(5) ? true : false;
	}

	public boolean checkTwoOfAKind(Card[] hand) {
		return fillNumberMap(hand).containsValue(2) ? true : false;
	}

	public boolean checkThreeOfAKind(Card[] hand) {
		return fillNumberMap(hand).containsValue(3) ? true : false;
	}

	public boolean checkFourOfAKind(Card[] hand) {
		return fillNumberMap(hand).containsValue(4) ? true : false;
	}

	public boolean checkAceInHand(Card[] hand) {
		return (fillNumberMap(hand).get(CardNumber.ACE) > 0);
	}

	public boolean checkTwoPair(Card[] hand) {
		Map<CardNumber, Integer> numberMap = fillNumberMap(hand);
		int amountOfPairs = 0;
		for(Integer value : numberMap.values()) {
			if(value == 2) {
				amountOfPairs++;
			}
		}

		return amountOfPairs == 2 ? true : false;
	}

	/* ----- HELPER OF HELPER FUNCTIONS (to count the amounts of number and suits in a hand) ----- */

	/**
	 * Counts how many suits of each kind and stores it in a Map<SUIT, AMOUNT>
	 * (fills the values of a suit-map given an incoming hand)
	 * 
	 * @param hand
	 * @return Map containing all suits and the amount of them in the given hand
	 */
	private Map<CardSuit, Integer> fillSuitMap(Card[] hand) {
		Map<CardSuit, Integer> suitMap = generateEmptySuitMap();

		// Increments the corresponding value in the map for every card
		for(Card card : hand) {
			suitMap.put(card.getSuit(), suitMap.get(card.getSuit()) + 1);
		}

		return suitMap;
	}

	/**
	 * Counts how many numbers of each kind in a hand and stores it in a Map<NUMBER, AMOUNT>
	 * (fills the values of a number-map given an incoming hand)
	 * 
	 * @param hand
	 * @return Map containing all numbers and the amount of them in the given hand
	 */
	private Map<CardNumber, Integer> fillNumberMap(Card[] hand) {
		Map<CardNumber, Integer> numberMap = generateEmptyNumberMap();

		// Increments the corresponding value in the map for every card
		for(Card card : hand) {
			numberMap.put(card.getNumber(), numberMap.get(card.getNumber()) + 1);
		}

		return numberMap;
	}

	/**
	 * Creates a map with all kinds of suits as keys and initializes it to zero matches
	 */
	private Map<CardSuit, Integer> generateEmptySuitMap() {
		Map<CardSuit, Integer> suitMap = new HashMap<CardSuit, Integer>();

		for(CardSuit cardSuit : CardSuit.values()) {
			suitMap.put(cardSuit, 0);
		}

		return suitMap;
	}

	/**
	 * Creates a map with all kinds of numbers as keys and initializes it to zero matches
	 */
	private Map<CardNumber, Integer> generateEmptyNumberMap() {
		Map<CardNumber, Integer> numberMap = new HashMap<CardNumber, Integer>();

		for(CardNumber cardNumber : CardNumber.values()) {
			numberMap.put(cardNumber, 0);
		}

		return numberMap;
	}

}
