package deck;

import deck.Card;
import java.util.Random;

public class Deck {
	private Card[] cards;
	private Random generator;
	
	public Deck() {
		generator = new Random();
		cards = new Card[52];
		init();
	}
	
	private void init() {
		for(int i=0; i<52; i++) {
			cards[i] = new Card(i+1);
		}
	}
	
	public int getCard(int i) {
		return cards[i].getCardNum();
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
}
