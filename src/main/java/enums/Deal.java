package enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deal {

	public static void main(String[] args) {

		int numHands = Integer.parseInt(args[0]);
		int numCards = Integer.parseInt(args[1]);

		if (numHands == 0)
			numHands = 4;

		List<Card> deck = Card.newDeck();
		Collections.shuffle(deck);

		for (int i = 0; i < numHands; i++) {
			System.out.println(dealHands(deck, numCards));

		}

	}

	private static <E extends Comparable<E>> ArrayList<E> dealHands(
			List<E> deck, int numCards) {
		int deckSize = deck.size();

		List<E> handView = deck.subList(deckSize - numCards, deckSize);
		ArrayList<E> hand = new ArrayList<>(handView);

		handView.clear();
		Collections.sort(hand);

		return hand;
	}
}
