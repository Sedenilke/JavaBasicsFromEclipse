package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String myName = "Seden";
		String myLastName = "Ran";
		char grade = '8';
		String myCity = "San Diego";
		String myState = "CA";
		int myPhone = 6543212;

		System.out.println("a");
		System.out.println("My name is " + myName + " and my last name is " + myLastName + ".");
		System.out.println("I am a grade " + grade + " student.");
		System.out.println("I live in " + myCity + ", " + myState + ".");
		System.out.println("And my phone number is " + myPhone + ".");
		System.out.println();

		grade = '9';
		myCity = "Phonex";
		myState = "Arizona";
		myPhone = 9999999;
		System.out.println("b)");
		System.out.println("My name is " + myName + " and I moved to " + myCity + ", " + myState + ".");
		System.out.println("My new phone number is " + myPhone + ".");
		System.out.println("I will start grade " + grade + " this year.");

	}

}
