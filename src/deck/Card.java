package deck;

public class Card {
	private int cardNum;
	private boolean visible;
	
	public Card() {
		cardNum = 1;
		visible = false;
	}
	
	public Card(int num) {
		cardNum = num;
		visible = false;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void makeVisible() {
		visible = true;
	}
	
	public void changeVisible() {
		visible = !visible;
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
	
	public String getCardName() {
		if(this.getCardNum() >= 49) {
			return "Ace" + getSuitName();
		}
		else if(this.getCardNum() >= 45) {
			return "King" + getSuitName();
		}
		else if(this.getCardNum() >= 41) {
			return "Queen" + getSuitName();
		}
		else if(this.getCardNum() >= 37) {
			return "Jack" + getSuitName();
		}
		else if(this.getCardNum() >= 33) {
			return "Ten" + getSuitName();
		}
		else if(this.getCardNum() >= 29) {
			return "Nine" + getSuitName();
		}
		else if(this.getCardNum() >= 25) {
			return "Eight" + getSuitName();
		}
		else if(this.getCardNum() >= 21) {
			return "Seven" + getSuitName();
		}
		else if(this.getCardNum() >= 17) {
			return "Six" + getSuitName();
		}
		else if(this.getCardNum() >= 13) {
			return "Five" + getSuitName();
		}
		else if(this.getCardNum() >= 9) {
			return "Four" + getSuitName();
		}
		else if(this.getCardNum() >= 5) {
			return "Three" + getSuitName();
		}
		else {
			return "Two" + getSuitName();
		}
	}
	
	private String getSuitName() {
		if(this.getCardNum()%4 == 0) {
			return " of Spades";
		}
		else if(this.getCardNum()%4 == 1) {
			return " of Hearts";
		}
		else if(this.getCardNum()%4 == 2) {
			return " of Clubs";
		}
		else {
			return " of Diamonds";
		}
	}
}
