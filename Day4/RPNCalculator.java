package ssa;

import java.util.Stack;
import java.util.Scanner;

public class RPNCalculator {
	int answer = 0;
	String formula;
	public void calculate(){
		//declaring a variable and setting it to an array
				char[] problem = new char[] {'1','2','+','3','+','4','+','5','/'};
				//define stack Class variable = new Classname() so now I can refer to the new stack Integer as stk
				Stack<Integer> stk = new Stack<Integer>(); 
				formula = String.valueOf(problem);
				for(char ch : problem){
					int firstParameter = Character.getNumericValue(ch);
					if (firstParameter != -1){
						stk.push(firstParameter);
					
					} else { 
						
						if (ch == '+'){
						int p2 = stk.pop();
						int p1 = stk.pop();
						int total = p1 + p2;
						stk.push(total);
					
						} else if(ch == '-') {
							int p2 = stk.pop();
							int p1 = stk.pop();
							int total = p1 - p2;
							stk.push(total);
							
						} else if(ch == '*') {
							int p2 = stk.pop();
							int p1 = stk.pop();
							int total = p1 * p2;
							stk.push(total);
							
						} else if (ch == '/') {
							int p2 = stk.pop();
							int p1 = stk.pop();
							int total = p1 / p2;
							stk.push(total);
							
						}
					}
				}
					
				answer = stk.pop();
				
	}
	
	public static void main(String[] args) {
		RPNCalculator calculator = new RPNCalculator();
		
		
		Scanner scan = new Scanner(System.in);
		boolean stop = false;    
		while(!stop) {
			calculator.calculate();
			System.out.println("Your RPN Calculation looks like this: " + calculator.formula);
			System.out.printf("And your answer is %d\n", calculator.answer);
			System.out.println("Would you like to calculate another problem?");
		    System.out.println("Would like to calculate again yes or no?)");
		    String s = scan.nextLine();
		    if(s.equals("no")) {
		        stop = true;
		    }
		}
	}
	
	

}


