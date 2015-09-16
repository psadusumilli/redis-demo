package enums;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Card implements Comparable<Card>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8163882893519723048L;


	public enum Rank {
		DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, ACE
	};

	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	};

	private final Rank rank;
	private final Suit suit;

	public Rank rank() {
		return rank;
	}

	public Suit suit() {
		return suit;
	}

	private Card(Rank rank, Suit suit) {

		if (rank == null || suit == null)
			throw new NullPointerException(rank + ", " + suit);

		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		return rank + ", " + suit;
	}

	private static final List<Card> prototypeDeck = new ArrayList<>(52);

	static {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				prototypeDeck.add(new Card(rank, suit));
			}
		}
	}

	public static List<Card> newDeck() {
		return new ArrayList<>(prototypeDeck);
	}
	

	@Override
	public int compareTo(Card o) {
		
		int suitCompare = suit.compareTo(o.suit);
		
		return (suitCompare == 0 ? rank.compareTo(o.rank)
								: suitCompare);
	}

}
