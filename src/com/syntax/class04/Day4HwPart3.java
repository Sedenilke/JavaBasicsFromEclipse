package com.syntax.class04;

import java.util.Scanner;

public class Day4HwPart3 {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less or equal to 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */

		Scanner obj = new Scanner(System.in);

		System.out.println("What is the amount of loan do you need? Please provide your answer here: ");
		double loan = obj.nextDouble();
		if (loan <= 200000) {
			System.out.println("No problem, we can lend you this amount.");
		} else {
			System.out.println("Unfortunately, we cannot give an approval for this amount.");
		}

	}
}
