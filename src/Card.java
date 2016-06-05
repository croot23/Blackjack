// all code written by Joseph Croot

public class Card {
	
	/* 
	public enum Suites {HEARTS, DIAMONDS, SPADES, CLUBS};
	public enum Names {
		ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);
		private int value;
		private Names(int value) {
			this.value = value;
		}
	}
	*/
	
	public String name;
	public String suite;
	public int value;
	
	public  void setInfo(String name, String suite, int value) {
		this.name = name;
		this.value = value;
		this.suite = suite;
	}

	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}

	public String getSuite() {
		return suite;
	}
	
}
