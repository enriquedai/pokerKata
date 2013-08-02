package org.enriquedai.katas.poker.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.enriquedai.katas.poker.Deck;
import org.enriquedai.katas.poker.PokerManager;
import org.junit.Test;

public class HelperFunctionsTest {

	PokerManager pokerManager = new PokerManager();

	@Test
	public void testCheckSuitedHand() {
		assertFalse(pokerManager.checkSuitedHand(Deck.HIGH_CARD));
		assertTrue(pokerManager.checkSuitedHand(Deck.FLUSH));
		assertTrue(pokerManager.checkSuitedHand(Deck.STRAIGHT_FLUSH));
	}

	@Test
	public void testFourOfAKind() {
		assertFalse(pokerManager.checkFourOfAKind(Deck.HIGH_CARD));
		assertFalse(pokerManager.checkFourOfAKind(Deck.THREE_OF_A_KIND));
		assertTrue(pokerManager.checkFourOfAKind(Deck.FOUR_OF_A_KIND));
	}

	@Test
	public void testThreeOfAKind() {
		assertFalse(pokerManager.checkThreeOfAKind(Deck.HIGH_CARD));
		assertFalse(pokerManager.checkThreeOfAKind(Deck.FOUR_OF_A_KIND));
		assertTrue(pokerManager.checkThreeOfAKind(Deck.THREE_OF_A_KIND));
	}

	@Test
	public void testTwoOfAKind() {
		assertFalse(pokerManager.checkTwoOfAKind(Deck.HIGH_CARD));
		assertFalse(pokerManager.checkTwoOfAKind(Deck.FOUR_OF_A_KIND));
		assertFalse(pokerManager.checkTwoOfAKind(Deck.THREE_OF_A_KIND));
		assertTrue(pokerManager.checkTwoOfAKind(Deck.ONE_PAIR));
		assertTrue(pokerManager.checkTwoOfAKind(Deck.TWO_PAIR));
		assertTrue(pokerManager.checkTwoOfAKind(Deck.FULL_HOUSE));
	}

	@Test
	public void testTwoPair() {
		assertFalse(pokerManager.checkTwoPair(Deck.HIGH_CARD));
		assertFalse(pokerManager.checkTwoPair(Deck.ONE_PAIR));
		assertTrue(pokerManager.checkTwoPair(Deck.TWO_PAIR));
	}

	@Test
	public void testStraight() {
		assertFalse(pokerManager.checkStraight(Deck.HIGH_CARD));
		assertFalse(pokerManager.checkStraight(Deck.FAKE_STRAIGHT));
		assertTrue(pokerManager.checkStraight(Deck.STRAIGHT));
		assertTrue(pokerManager.checkStraight(Deck.STRAIGHT_BEGIN_WITH_ACE));
		assertTrue(pokerManager.checkStraight(Deck.STRAIGHT_FLUSH));
		assertTrue(pokerManager.checkStraight(Deck.ROYAL_FLUSH));
	}

}
