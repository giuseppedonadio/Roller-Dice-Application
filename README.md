# Roller-Dice-Application

If the user chooses to roll the dice, the application rolls two six-sided dice, displays the results of each, and asks if the user wants to roll again.

Welcome to the Dice Roller

Roll the dice? (y/n): y

Roll 1:

2

5

Craps!

Roll again? (y/n): y

Roll 2:

6

6

Box cars!

Roll again? (y/n): y

Roll 3:

1

1

Snake eyes!

Roll again? (y/n): n

Specifications:

Die stores the data about each die.

      public Die()              // default to a six-sided die
      
      public Die(int sides)     // allow a variable number of sides
      
      public void roll()
      
      public int getValue()
 
PairOfDice stores two dice. 
This class contains two instance variables of the Die type, an instance variable that holds the sum of the two dice, and these constructors and methods:
      
      public PairOfDice()           // default to six-sided dice
      
      public PairOfDice(int sides)  // allow a variable number of sides
      
      public void roll()
      
      public int getValue1()        // get value of die1
      
      public int getValue2()        // get value of die2
      
      public int getSum()           // get the sum of both dice
      
DiceRollerApp uses the PairOfDice class to roll the dice. 
This class displays special messages for craps (sum of both dice is 7), snake eyes (double 1’s), and box cars (double 6’s). 
For this application, assume that two six-sided dice are used.




