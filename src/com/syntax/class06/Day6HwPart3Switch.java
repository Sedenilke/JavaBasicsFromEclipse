package com.syntax.class06;

import java.util.Scanner;

public class Day6HwPart3Switch {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter your first number: ");
		int num1 = obj.nextInt();
		System.out.println("Please type your operator(+, -, *, /):");
		char operator = obj.next().charAt(0);
		// gives another chance to type one of the right operators
		if (operator != '*' && operator != '/' && operator != '+' && operator != '-') {
			System.out.println("Please provide a valid operator.");
			operator = obj.next().charAt(0);
		} // second choice for the operator is also not correct
		if (operator != '*' && operator != '/' && operator != '+' && operator != '-') {
			System.out.println("We cannot continue because you did not choose a valid operator.");
		} else {
			System.out.println("Please enter your second number: ");
			int num2 = obj.nextInt();
			int result = 0; // division by zero is undefined
			if (num2 == 0 && operator == '/') {
				System.out.println("It is undefined!");
			} else {
				switch (operator) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				}
				System.out.println("Your numbers were " + num1 + " and " + num2
						+ ". Based on your operator choice result is " + result + ".");
			}

		}
	}
}
