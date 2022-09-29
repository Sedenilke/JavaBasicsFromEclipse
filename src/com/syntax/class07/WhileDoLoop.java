package com.syntax.class07;

import java.util.Scanner;

public class WhileDoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Syntax for do while loop:
		 *  do {
		 *   code to be repeated 
		 *   decreament or increment of variable
		 *   } 
		 *   while ( condition)
		 */
		//below one is a good example for using do-while loop, cunku kullanicidan bir girdi bekliyoruz ilk olarak
		//conditioni kod baslamadan once kontrol etmek istemiyorum

		Scanner obj = new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Did you get a job?");
			answer = obj.next();
		}
		while(!answer.equalsIgnoreCase("Yes"));
		System.out.println("Congrutulations!");
		
		System.out.println("---------------------");
		
		//we still can do the same example using while loop:
		System.out.println("Did you get a job?");
		answer = obj.next();
		
		while(!answer.equalsIgnoreCase("Yes")){
			System.out.println("Did you get a job?");
			answer = obj.next();
		}
		System.out.println("Congrutulations!");
		
		//While vs do while:
		//both loops executed while condition is true
		//while loop first CHECK condition --> if true-->execute code
		//do while first EXECUTES code --> then check the condition
		
	}

}
