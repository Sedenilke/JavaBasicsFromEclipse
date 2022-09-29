package com.syntax.class08;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money, accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever user done with payments program should say
		 * "Thank you for shopping!" This is my code:
		 */
		Scanner obj = new Scanner(System.in);

		System.out.println("What do you want to purchase today?");
		String item = obj.nextLine();
		System.out.println("what is the price for this item?");
		double price = obj.nextDouble();
		System.out.println("Please type the amount to make the payment: ");
		double payment = obj.nextDouble();
		double difference = 0.0;
		double change = 0.0;

		while (payment != price && price !=0) {
			if (payment < price) {
				difference = price - payment;
				System.out.println("You should pay " + difference + " more.");
				payment = obj.nextDouble();
				price = difference;

			} else if (payment > price) {
				change = payment - price;
				System.out.println("You paid more than the actual price. Here is your change " + change);
				break;
			}

		}
		System.out.println("Thank you for your shopping!");
	}

}
