package deck;

import deck.Card;
import java.util.Random;

public class Deck {
	private Card[] cards;
	private Random generator;
	private int index;
	
	public Deck() {
		generator = new Random();
		cards = new Card[52];
		index=0;
		init();
	}
	
	private void init() {
		for(int i=0; i<52; i++) {
			cards[i] = new Card(i+1);
		}
	}
	
	public Card getCard(int i) {
		return cards[i];
	}
	
	public void shuffle() {
		int cardsShuffled = 0;
		
		while(cardsShuffled<10000) {
			int tempIndex1 = generator.nextInt(52);
			int tempIndex2 = generator.nextInt(52);
			
			Card tempCard1 = cards[tempIndex1];
			Card tempCard2 = cards[tempIndex2];
			
			cards[tempIndex2] = tempCard1;
			cards[tempIndex1] = tempCard2;
			
			cardsShuffled++;
		}
	}
	
	public Card pop() {
		if(index >= 52) {
			throw new ArrayIndexOutOfBoundsException("The entire deck has been dealt.");
		}
		
		return cards[index++];
	}
	
}
