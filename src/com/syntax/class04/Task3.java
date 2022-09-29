package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner newObj = new Scanner(System.in);
		Scanner newObj2 = new Scanner(System.in);

		System.out.println("Did you solve any Repl Assignments. Please enter true or false");
		boolean solvedAnyRepls = newObj.nextBoolean();

		if (solvedAnyRepls) {
			System.out.println("How many repls you solved. Please type your number: ");
			int noOfReplsSolved = newObj2.nextInt();

			if (noOfReplsSolved >= 17) {
				System.out.println("You are doing great");
			} else if (noOfReplsSolved > 10) {
				System.out.println("You are doing ok. Please complete them as soon as possible");
			} else {
				System.out.println("You should solve more repls");
			}
		} else {
			System.out.println("They are very important to learn java please solve them");
		}
	}

}
