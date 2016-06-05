// all code written by Joseph Croot

public class Player {
	
	public   Hand hand = new Hand();
	
	public void addCard(Card card) {
		hand.addPlayerCard(card);
	}
	
	public String getLastCardInfo() {
		String cardInfo = hand.getCard(hand.numberOfCards-1).getName()+" of "+hand.getCard(hand.numberOfCards-1).getSuite();
		return cardInfo;
	}
	
	public int getTotal() {
		return hand.getTotal();
	}
	
	public Hand getHand() {
		return hand;
	}
	
	public void reset() {
		hand.reset();
	}
	
}
