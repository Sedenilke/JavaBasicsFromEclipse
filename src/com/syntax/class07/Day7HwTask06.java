package com.syntax.class07;

import java.util.Scanner;

public class Day7HwTask06 {

	public static void main(String[] args) {
		/*
		 * Declare a variable to store a price for a coffee. Ask the user to pay for a
		 * coffee. Keep asking to pay for coffee until the user enters the EXACT amount
		 * . If the user gives more than coffee price --> ask them to give less, if the
		 * user gives less money then ask to give more. Once user give EXACT amount
		 * print “Please enjoy your coffee
		 */

		double priceOfCoffee = 2.90;
		double input;
		Scanner obj = new Scanner(System.in);
		System.out.println("Please make your payment for the coffee:");
		do {

			input = obj.nextDouble();
			if (input > priceOfCoffee) {
				System.out.println("The price of the coffee is less than this amount.");
			} else if (input < priceOfCoffee) {
				System.out.println("The price of the coffee is more than this amount.");

			}
		} while (input != priceOfCoffee);
		System.out.println("Please enjoy your coffee!");

	}

}
