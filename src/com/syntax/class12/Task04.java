package com.syntax.class12;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// With scanner ask the two people's first
		// names and if they expecting boy or girl?
		// Based on the input suggests a name for a baby:
		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY
		// if they expect girl, then the first part of the name will come from the
		// mother's name and the other half will come from father's name

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter Mother's name: ");
		String motherName = scanner.next();
		System.out.println("Please enter Father's name: ");
		String fatherName = scanner.next();
		System.out.println("What do you expect? A boy or a girl?");
		String genderOfBaby = scanner.next();

		if (genderOfBaby.equalsIgnoreCase("girl")) {
			System.out.println("Here is our suggestion for your baby's name: ");
			if (fatherName.length() % 2 == 0) {
				System.out.println(motherName.substring(0, motherName.length() / 2)
						+ fatherName.substring(fatherName.length() / 2));
			} else { 
				//Program splits the name into half based on the middle character.
				//This middle character is not included for neither of those half parts.
				System.out.println(motherName.substring(0, motherName.length() / 2)
						+ fatherName.substring(fatherName.length() / 2 + 1));
			}

		} else if (genderOfBaby.equalsIgnoreCase("boy")) {
			System.out.println("Here is our suggestion for your baby's name: ");
			if (motherName.length() % 2 == 0) {
				System.out.println(fatherName.substring(0, fatherName.length() / 2)
						+ motherName.substring(motherName.length() / 2));
			} else {
				System.out.println(fatherName.substring(0, fatherName.length() / 2)
						+ motherName.substring(motherName.length() / 2 + 1));
			}
		}
	}
}
