package com.syntax.class03;

public class NumberMonthMatch {

	public static void main(String[] args) {

		/*
		 * Create a Java program and declare int variable that will hold a month. Based
		 * on the value of the variable your program should print the name of the month.
		 */
		System.out.print("Name of the month is ");
		int numOfMonth;
		numOfMonth = 4;

		if (numOfMonth == 1) {
			System.out.println("January.");
		} else if (numOfMonth == 2) {
			System.out.println("February.");
		} else if (numOfMonth == 3) {
			System.out.println("March.");
		} else if (numOfMonth == 4) {
			System.out.println("April.");
		} else if (numOfMonth == 5) {
			System.out.println("May.");
		} else if (numOfMonth == 6) {
			System.out.println("June.");
		} else if (numOfMonth == 7) {
			System.out.println("July.");
		} else if (numOfMonth == 8) {
			System.out.println("August.");
		} else if (numOfMonth == 9) {
			System.out.println("September.");
		} else if (numOfMonth == 10) {
			System.out.println("October.");
		} else if (numOfMonth == 11) {
			System.out.println("November.");
		} else if (numOfMonth == 12) {
			System.out.println("December.");
		} else {
			System.out.println("Please type a number between 1 and 12 (inluding this numbers)");
		}
		System.out.println("----------------------------");

	}

}
