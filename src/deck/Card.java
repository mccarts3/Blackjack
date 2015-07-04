package deck;

public class Card {
	private int cardNum;
	
	public Card() {
		cardNum = 1;
	}
	
	public Card(int num) {
		cardNum = num;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	//Gets the value of the card for in-game use
	public int getCardVal(boolean aceIsOne) {
		if(this.getCardNum() >= 49) {
			if(aceIsOne) 
				return 1;
			else 
				return 11;
		}
		else if(this.getCardNum() >= 33) {
			return 10;
		}
		else if(this.getCardNum() >= 29) {
			return 9;
		}
		else if(this.getCardNum() >= 25) {
			return 8;
		}
		else if(this.getCardNum() >= 21) {
			return 7;
		}
		else if(this.getCardNum() >= 17) {
			return 6;
		}
		else if(this.getCardNum() >= 13) {
			return 5;
		}
		else if(this.getCardNum() >= 9) {
			return 4;
		}
		else if(this.getCardNum() >= 5) {
			return 3;
		}
		else {
			return 2;
		}
	}
}
