package bridgegame;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract class CardHolder {
	
	LinkedList<Card> contents;

	protected void shuffle() {
		LinkedList<Card> temp = (LinkedList<Card>) contents.clone();
		contents.clear();
		Random rand = new Random();
		while(temp.size() > 0) {
			int index = rand.nextInt(temp.size());
			contents.add(temp.get(index));
			temp.remove(index);
		}
	}
}
