package com.syntax.class06;

import java.util.Scanner;

public class Day6HwPart2 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Please type a letter from this list: A, B, C, D. (Beaware program is case sensitive)");
		char letter = obj.next().charAt(0);
		String explanation = "Null";

		switch (letter) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			System.out.println("Please type a letter from the given list.");
			explanation = "Unknown";
			break;
		}
		if (!(explanation.equals("Unknown"))) {
			System.out.println("You entered " + letter + " which means " + explanation + ".");

		}
	}
}