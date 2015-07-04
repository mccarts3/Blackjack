package utilities;
import deck.*;
import players.*; 
public class BlackjackTester {

	public static void main(String[] args) {
		Deck d = new Deck();
		//NOT USED
		//User me = new User();
		//AIPlayers ai1 = new AIPlayers();
		
		//Displays entire deck values 1-52
		for(int i=0; i<52; i++) {
			System.out.print(d.getCard(i) + " ");
		}
		
		d.shuffle();
		
		System.out.println("\n\nShuffle attempt");
		
		//Displays the shuffled deck
		for(int i=0; i<52; i++) {
			System.out.print(d.getCard(i) + " ");
		}
		
		System.out.println("\n\nDeal the first three cards.");
		System.out.print(d.pop().getCardNum() + " " + d.pop().getCardNum() +
				" " + d.pop().getCardNum());
	}

}
