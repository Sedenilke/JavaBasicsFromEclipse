package com.syntax.class04;

import java.util.Scanner;

public class Day4HwPart2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash
		 */
		Scanner obj = new Scanner(System.in);
		System.out.println("Customer: What is the current mortgage rate?");
		System.out.print("Mortgage Loan Officer:");
		double mortgageRate = obj.nextDouble();
	
		if (mortgageRate > 4.5) {
			System.out.println("Customer: It is higher than I expected. Let me reconsider again.");
		} else {
			System.out.println("Customer: It is not so bad.");
			System.out.println("Mortgage Loan Officer: What is the price of the house that you want to purchase?");
			System.out.print("Customer:");
			double priceOfHouse = obj.nextDouble();
			if (priceOfHouse > 200000) {
				System.out.println("Customer: ...so, I think it is better to take the loan.");
			} else {
				System.out.println("Customer:..so even though the rate is good, I think I will pay it all in cash.");
			}
		}

	}

}
