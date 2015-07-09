package players;

public abstract class Player {
	private float balance;
	private int handVal;
	
	abstract float getBalance();
	abstract void updateBalance(int difference);
	abstract void updateHandVal(int newCard);
	abstract int getHandVal();
	abstract void resetHandVal();
}
