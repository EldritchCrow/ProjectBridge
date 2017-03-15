package bridgegame;

import java.util.LinkedList;
import java.util.Random;

public class Deck extends CardHolder {
	
	public Deck() {
		contents = new LinkedList<Card>();
		for(int i = 1; i <= 13; i++) {
			contents.add(new Card(i, 'C'));
			contents.add(new Card(i, 'H'));
			contents.add(new Card(i, 'D'));
			contents.add(new Card(i, 'S'));
		}
		this.shuffle();
	}
}
