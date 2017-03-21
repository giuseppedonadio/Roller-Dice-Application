package rollDice;

import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		String answer = "y";
		
		//ask user if wants to roll dice
		System.out.println("Roll Dice?");
		answer = sc.nextLine();
		System.out.println();
		
		//if yes create object, show results and ask if user want to continue
		if(answer.equalsIgnoreCase("y")){
			
			//create object
			PairOfDice d = new PairOfDice();
			
			int i = 1;
			while(choice.equalsIgnoreCase("y")) {
				
				//show values of dice and result
				System.out.println("Roll " + i + ":\n" + d.getValue1() + " - " + d.getValue2());
				i++;
				System.out.println(d.getResult());
				
				//ask if user want to continue
				System.out.println("Continue? (y/n)");
				choice = sc.nextLine();
				System.out.println();
			}	
		}
		sc.close();
		System.out.println("Bye!");

	}

}
