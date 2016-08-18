package ssa;

import java.util.Stack;

public class RPNCalculator {
	
	public static void main(String[] args) {
		char[] problem = new char[] {'1','2','3','+','*'};
		//define stack Class variable = new Classname() so now I can refer to the new stack Integer as stk
		Stack<Integer> stk = new Stack<Integer>(); 
		String formula = String.valueOf(problem);
		for(char ch: problem){
			int firstParameter = Character.getNumericValue(ch);
			if (firstParameter != -1){
				stk.push(firstParameter);
			
			} else { 
				
				if (ch == '+'){
				int p1 = stk.pop();
				int p2 = stk.pop();
				int total = p1 + p2;
				stk.push(total);
			
				} else if(ch == '*') {
					int p1 = stk.pop();
					int p2 = stk.pop();
					int total = p1 * p2;
					stk.push(total);
				} else if(ch == '-') {
					int p1 = stk.pop();
					int p2 = stk.pop();
					int total = p1 - p2;
					stk.push(total);
					
				} else if (ch == '/') {
					int p1 = stk.pop();
					int p2 = stk.pop();
					int total = p1 / p2;
					stk.push(total);
					
				}
			}
		}
			
		int answer = stk.pop();
		System.out.println("Your RPN Calculation looks like: " + formula);
		System.out.printf("And your total is %d\n", answer);
		System.out.println("Great job!");
		System.out.println("Would you like to calculate another problem?");
	}
	

}


