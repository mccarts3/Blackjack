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
			System.out.print(d.getCard(i).getCardNum() + " ");
		}
		
		System.out.println("\n\nThe values of each card used in Blackjack:");
		//Display each card's value
		for(int i=0; i<52; i++) {
			System.out.print(d.getCard(i).getCardVal(false) + " ");
		}
		
		d.shuffle();
		
		System.out.println("\n\nShuffle attempt");
		
		//Displays the shuffled deck
		for(int i=0; i<52; i++) {
			System.out.print(d.getCard(i).getCardNum() + " ");
		}
		
		//pop() works, and throws an exception if you try to deal
		//a card outside of the array index
		System.out.println("\n\nTesting the pop() method 3 times:");
		System.out.print(d.pop().getCardNum() + " ");
		System.out.print(d.pop().getCardNum() + " ");
		System.out.print(d.pop().getCardNum() + " ");
		/*
			System.out.println("\n\nDeal the deck plus one extra card.");
			for(int i=0; i<100; i++) {
				System.out.print(d.pop().getCardNum() + " ");
			}
		*/
	}

}
