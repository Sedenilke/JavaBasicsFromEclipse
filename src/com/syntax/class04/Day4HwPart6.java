package com.syntax.class04;

import java.util.Scanner;

public class Day4HwPart6 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */
		Scanner obj = new Scanner(System.in);
		System.out.println("Do you have a credit card? Please type true for yes and false for no.");
		boolean creditCard = obj.nextBoolean();

		if(creditCard) {
			System.out.println("What is your balance on this card?");
			double balance = obj.nextDouble();
			if(balance > 1000) {
				System.out.println("It will be so much better for you if you pay it off immediately!");
			}
			else {
				System.out.println("Oh that is not so bad. You can spend more!");
			}
			
		}
		else {
			System.out.println("Do you want me to apply a credit card for you? We have pretty good deals right now.");
		}
	}

}
