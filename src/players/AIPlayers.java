package players;

public class AIPlayers extends Player {
	private float balance;
	private int handVal;
	private final int DEFAULT_BALANCE = 10000;
	
	public AIPlayers() {
		balance = DEFAULT_BALANCE;
		handVal = 0;
	}
	
	public AIPlayers(int balance) {
		this.balance = balance;
		handVal = 0;
	}
	
	@Override
	public float getBalance() {
		return balance;
	}

	@Override
	public void updateBalance(int difference) {
		balance += difference;
	}

	@Override
	public void updateHandVal(int newCard) {
		handVal += newCard;
	}

	@Override
	public int getHandVal() {
		return handVal;
	}
	
	@Override
	public void resetHandVal() {
		handVal = 0;
	}

}
