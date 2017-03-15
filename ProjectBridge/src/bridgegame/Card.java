package bridgegame;

public class Card {
	
	private int value;
	private char suite;
	
	public Card(int v, char s) {
		this.value = v;
		this.suite = s;
	}
	
	public boolean equals(Card c) {
		return (this.value == c.value) && (this.suite == c.suite) ;
	}
	
	public String toString() {
		String toReturn = "";
		if(value == 1) {
			toReturn += "A";
		}
		else if(value == 11) {
			toReturn += "J";
		}
		else if(value == 12) {
			toReturn += "Q";
		}
		else if(value == 13) {
			toReturn += "K";
		}
		else if(value > 1 && value < 11) {
			toReturn += Integer.toString(value);
		}
		else {
			toReturn += "INVALID_VALUE";
		}
		toReturn += suite;
		return toReturn;
	}
}
