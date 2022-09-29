package com.syntax.class04;

import java.util.Scanner;

public class Day4HwPart1 {

	public static void main(String[] args) {
		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a diploma program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output should
		 * say “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder”
		 */
		Scanner obj = new Scanner(System.in);
		System.out.println("Do you have a degree? Please type true for yes, false for no: ");
		boolean degree = obj.nextBoolean();

		if (degree) {
			System.out.println("Congratulations!");
			System.out.println("Please type your GPA score:");
			double gpa = obj.nextDouble();
			if (gpa >= 3.5) {
				System.out.println("Nice! You are eligible for scholarship.");
			} else {
				System.out.println("Sorry, you are not eligable for the scholarship. You should study harder!");
			}
		} else {
			System.out.println("Sorry, to get a scholarship you should have a degree first.");
		}
	}
}

