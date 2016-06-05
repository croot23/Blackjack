
// all code written by Joseph Croot

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Deck {

	private static int numberOfCards;
	static ArrayList<Card> cards;

	public static Card getCard() {
		Card card = cards.get(numberOfCards);
		numberOfCards++;
		return card;
	}

	public static ArrayList<Card> getCards() {
		return cards;
	}

	public static void setCards(ArrayList<Card> cards) {
		Deck.cards = cards;
	}

	public static Deck createDeck() {

		Deck playingDeck = new Deck();

		// create suites
		ArrayList<String> suites = new ArrayList<String>();
		suites.add("Hearts");
		suites.add("Diamonds");
		suites.add("Spades");
		suites.add("Clubs");

		// create card values
		HashMap<String, Integer> nameValues = new HashMap<String, Integer>();
		nameValues.put("Ace", 11);
		nameValues.put("Two", 2);
		nameValues.put("Three", 3);
		nameValues.put("Four", 4);
		nameValues.put("Five", 5);
		nameValues.put("Six", 6);
		nameValues.put("Seven", 7);
		nameValues.put("Eight", 8);
		nameValues.put("Nine", 9);
		nameValues.put("Ten", 10);
		nameValues.put("Jack", 10);
		nameValues.put("Queen", 10);
		nameValues.put("King", 10);

		// create card objects and add them to the deck
		ArrayList<Card> cards = new ArrayList<Card>(52);
		for (int i = 0; i < suites.size(); i++) {
			String suite = suites.get(i);
			Iterator<Entry<String, Integer>> itr = nameValues.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry pair = (Map.Entry) itr.next();
				String name = (String) pair.getKey();
				int value = (int) pair.getValue();
				Card card = new Card();
				card.setInfo(name, suite, value);
				cards.add(card);
			}
		}
		Deck.setCards(cards);
		return playingDeck;
	}

	public static ArrayList<Card> shuffleDeck(ArrayList<Card> currentCards) {
		Collections.shuffle(currentCards);
		currentCards.get(10);
		return currentCards;
	}

	public static void reset() {
		numberOfCards = 0;
		cards = null;
	}

}
