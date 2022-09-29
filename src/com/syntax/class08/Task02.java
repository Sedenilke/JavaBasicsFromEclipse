package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// Create a secret number and let user guess the secret number once user guessed
		// your secret number --> program says you won!

		int secretNumber = 34;
		int input;
		Scanner obj = new Scanner(System.in);
		System.out.println("What is my secret number?");

		do {
			input = obj.nextInt();
			if (input > secretNumber) {
				System.out.println("Secret number is less than this value. Try again!");
			} else if (input < secretNumber) {
				System.out.println("Secret number is more than this value. Try again!");
			}
		} while (input != secretNumber);
		System.out.println("Your guess is right!");

	}

}
