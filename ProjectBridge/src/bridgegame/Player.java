package bridgegame;

import java.util.LinkedList;

public class Player extends CardHolder {
	
	String name;
	
	public Player(String n) {
		this.name = n;
		contents = new LinkedList<Card>();
	}
	
	public void giveCard(Card c) throws Exception {
		for(Card i : contents) {
			if(c.equals(i)) {
				throw new Exception("Error: Gave a player its own card");
			}
		}
		contents.add(c);
	}
}
