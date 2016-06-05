// all code written by Joseph Croot

import java.util.ArrayList;

public class Hand {

	public ArrayList<Card> hand = new ArrayList<Card>(5);
	int numberOfCards;
	
	public void addPlayerCard(Card card) {
		hand.add(card);
		numberOfCards++;
	}

	public int getNumberOfCards() {
		return numberOfCards;
	}

	public int getTotal() {
		int total = 0;
		int aceCount = 0;
		for (int i=0; i<hand.size();i++){
			// count aces
			if (hand.get(i).getName().equalsIgnoreCase("Ace")) {
				aceCount++;
			}
			// add total as if aces equal ten
			total += hand.get(i).getValue();
			// if bust but the hand has aces, adjust aces value to 1
			while (total > 21 && aceCount > 0) {
				total = total -10;
				aceCount--;
			}
		}
		return total;
	}
	
	public Card getCard(int position) {
		Card card  = hand.get(position);
		return card;
	}
	
	public void reset() {
		hand.clear();
		numberOfCards = 0;
	}
	
}
