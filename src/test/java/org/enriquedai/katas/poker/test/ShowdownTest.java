package org.enriquedai.katas.poker.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.enriquedai.katas.poker.Deck;
import org.enriquedai.katas.poker.PokerManager;
import org.enriquedai.katas.poker.types.WinningHand;
import org.junit.Test;

public class ShowdownTest {

	PokerManager pokerManager = new PokerManager();

	@Test
	public void testWrongAmountOfCardsInHand() {
		try {
			pokerManager.showdown(Deck.WRONG_HAND);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void testHandIsHighCard() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.HIGH_CARD);
		assertTrue(winningHand.equals(WinningHand.HIGH_CARD));
	}

	@Test
	public void testHandIsOnePair() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.ONE_PAIR);
		assertTrue(winningHand.equals(WinningHand.ONE_PAIR));
	}

	@Test
	public void testHandIsTwoPair() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.TWO_PAIR);
		assertTrue(winningHand.equals(WinningHand.TWO_PAIR));
	}

	@Test
	public void testHandIsThreeOfAKind() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.THREE_OF_A_KIND);
		assertTrue(winningHand.equals(WinningHand.THREE_OF_A_KIND));
	}

	@Test
	public void testHandIsStraight() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.STRAIGHT);
		assertTrue(winningHand.equals(WinningHand.STRAIGHT));
	}

	@Test
	public void testHandIsFlush() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.FLUSH);
		assertTrue(winningHand.equals(WinningHand.FLUSH));
	}

	@Test
	public void testHandIsFullHouse() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.FULL_HOUSE);
		assertTrue(winningHand.equals(WinningHand.FULL_HOUSE));
	}

	@Test
	public void testHandIsFourOfAKind() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.FOUR_OF_A_KIND);
		assertTrue(winningHand.equals(WinningHand.FOUR_OF_A_KIND));
	}

	@Test
	public void testHandIsStraightFlush() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.STRAIGHT_FLUSH);
		assertTrue(winningHand.equals(WinningHand.STRAIGHT_FLUSH));
	}

	@Test
	public void testHandIsRoyalFlush() throws Exception {
		WinningHand winningHand = pokerManager.showdown(Deck.ROYAL_FLUSH);
		assertTrue(winningHand.equals(WinningHand.ROYAL_FLUSH));
	}

}
