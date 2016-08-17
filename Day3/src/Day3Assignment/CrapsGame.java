package Day3Assignment;
import java.util.Random;


public class CrapsGame {
	
	public static void main(String[] args){
		//created the long seed to get the random
		long seed = (new java.util.Date()).getTime();
		java.util.Random rnd = new java.util.Random(seed);
		
		//initialize variable total and set it equal to the results of RollDie method
		int total = rollOneDie.roll1die(rnd);
		
		int dieOne = 4;
		int dieTwo = 3;
		int totalRoll = dieOne + dieTwo;
		int firstRollTotal = 7;
		//int thePoint = the value of the firstRoll if it's not 7, 2, 3 or 12 
		
		if ( firstRollTotal == 7 ) {
			System.out.println( "You win" ) ;
		}
		else
			if ( firstRollTotal == (2 || 3 || 12) )   {
			System.out.println( "Loser" ) ;
   }
   else
      if ( firstRollTotal == thePoint){
         System.out.println( "The Point is " ) ;
      }
		
		for()
			RollDice rolldice = new RollDice();
		//do while statement
		do{
			
		}while(totalRoll != 7);
		
		//roll the dice
		//while(dice != 1)
		
		//set a condition in the while statement
		//rookie mistake, if you say true the while statement will run forever
		//in a while statement, what is in the while statement will never be run
		//infinte loop, your program never stops then blows up
		//be aware of your stopping point
		while(totalRoll <= 100){
			totalRoll += 5;
		}
Class RollDice{
	
	int total = 0; //declared and intitialized
	int die = 0; //variable that represents the die
	
	
	public int roll1die(Random rnd){
	while(die != 1) {
		die = rnd.nextInt(6) + 1; //roll the die and then add the condition
		//put an if in here
		if (die != 1){
			total += die; //add total to the die
		}
		
						
	    // do something
	}
	return total;
	
}
	}

}
