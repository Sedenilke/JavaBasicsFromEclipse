package com.syntax.class05;

public class LogicalOperations {

	public static void main(String[] args) {
		/*
		 * Assignment operators: = 
		 * Arithmetic operator: + , - , * , / , %
		 * Relational: > , >=, <, <=, ==, !=
		 * Logical: &&, ||, !
		 */

		
		double money = 40000;
		String title = "Manual Tester";
		
		if(title.equals("Automation Tester") || money == 120000) {
			System.out.println("You are happy");
		}
		else {
			System.out.println("You are not happy");
		}
	}

}
