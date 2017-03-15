package bridgegame;

import java.util.ArrayList;

public class BridgeController {
	
	ArrayList<Player> players;
	Deck deck;

	public static void main(String[] args) {
		new BridgeController();
	}
	
	public BridgeController() {
		deck = new Deck();
		for(Card c : deck.contents) {
			System.out.println(c.toString());
		}
	}
}
