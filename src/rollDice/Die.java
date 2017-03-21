package rollDice;

public class Die {

	private int value;
	private int sides;
	
	
	public Die() {
		value = 0;
		sides = 6;
	}
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int getSide() {
		return sides;
	}
	
	public void roll(int value) {
		this.value = value;	
	}
	
	public int getValue() {
		value = (int) (Math.random() * sides + 1);
		return value;
	}
	
}
