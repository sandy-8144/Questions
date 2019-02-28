package com.oracle.study.interviews;

import java.util.LinkedList;
import java.util.Scanner;

public class ParenthesisChecker {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		
		while(tests > 0) {
			boolean isBalanced=true;
			String input = sc.next();
			LinkedList<Character> stack = new LinkedList<Character>();
			char [] charArray = input.toCharArray();
			for(char c : charArray) {
				
				if( c =='[' || c== '{' || c=='(') {
					stack.push(c);
				}else if(c ==']' || c== '}' || c==')') {
					char temp = stack.pop();
					if((c==']' && temp!='[') || (c==')' && temp!='(') || (c=='}' && temp!='{') ) 
						isBalanced=false;
				}
			}
			
			if(!stack.isEmpty()) {
				isBalanced=false;
			}

			System.out.println("is_balanced:"+isBalanced);
			tests--;
		}
		
		
		sc.close();
	}
}
