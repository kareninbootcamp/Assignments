package CrapsGame;
import java.util.Random;

public class CrapsGame {
	
	public static void main(String[] args){
		//created the long seed to get the random
		long seed = (new java.util.Date()).getTime();
		java.util.Random rnd = new java.util.Random(seed);
		int wins = 0;
		int losses = 0;
		//initialize variable total and set it equal to the results of RollDie method
		//initiate a variable in our for loop;
		for (int totalGames=0; totalGames <= 124; totalGames = wins + losses ){
		int dieOne = rnd.nextInt(5)+1;
		int dieTwo = rnd.nextInt(5)+1;
		int totalRoll = dieOne + dieTwo;
		int point;
		//int thePoint = the value of the firstRoll if it's not 7, 2, 3 or 12 
	
		//create a method for first roll
		
	if(totalRoll==2 ||	totalRoll == 3 || totalRoll == 12){
		losses++;
		System.out.println( "You Lose!" );
	}
		else if (totalRoll == 7){
			wins++;
	System.out.println( "You win" ) ;
		}
		
		else {
			point = totalRoll;
		System.out.println("The point is " + point);
	
		while(true) {
			 dieOne = rnd.nextInt(5)+1;
			 dieTwo = rnd.nextInt(5)+1;
			 totalRoll = dieOne + dieTwo;
			System.out.println("The roll is " + totalRoll);
					
			if(totalRoll == point){
				wins++;
				System.out.println("Winner!");
				break;
			}
			if(totalRoll == 7){
				losses++;
				System.out.println("You rolled a 7. Better luck next time!");
				break;
			}
			}
		}
			System.out.println("Your number of wins is "+ wins);
			System.out.println("Your number of losses is "+ losses);
		}
	}
}
	
