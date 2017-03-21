package rollDice;

public class PairOfDice {
	
	private int sides;
	private int value1;
	private int value2;
	
	//create object Die
	Die d = new Die();
	
	public PairOfDice() {
		//get sides value from object
		sides = d.getSide();
		value1 = 0;
		value2 = 0;
	}
	
	public PairOfDice(int sides) {
		this.sides = sides;
	}

	public void roll(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	//get value for die 1
	public int getValue1() {	
		value1 =  (int) (Math.random() * sides + 1);
		return value1;
	}
	
	//get value for die 2
	public int getValue2() {
		value2 =  (int) (Math.random() * sides + 1);
		return value2;
	}
	
	//get sum of dice's value
	public int getSum() {
		return  value1 + value2;
	}
	
	//create string to show results based on the sum of the dice's value
	public String getResult() {
		String r = "";
		switch(getSum()){
		case 2: 
			r= "Snake Eyes!\n";
			break;
		case 7:
			r = "Claps!\n";
			break;
		case 12:
			r = "Box Car!\n";
			break;
		default: 
			r = "";
		}
		return r;
	}

}
