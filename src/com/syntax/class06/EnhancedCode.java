package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

	/*	System.out.println("What time is it? (Please provide your answer as a whole number and using 24 hour format)");
		int time = obj.nextInt();

		if (time >= 1 && time <= 11) {
			System.out.println("It is morning.");
		} else if (time >= 12 && time <= 15) {
			System.out.println("It is afternoon.");
		} else if (time >= 16 && time <= 20) {
			System.out.println("It is evening.");
		} else if (time >= 21 && time <= 24) {
			System.out.println("It is night.");
		} else {
			System.out.println("Please enter a valid value");
		}

		 * above code is long, we will try to write it short and clean.
		 * 
		 */
		
		System.out.println("What time is it? (Please provide your answer as a whole number and using 24 hour format)");
		int time = obj.nextInt();
		String timeOfTheDay;
		if (time >= 1 && time <= 11) {
			timeOfTheDay = "Morning";
		} else if (time >= 12 && time <= 15) {
			timeOfTheDay = "afternoon";
		} else if (time >= 16 && time <= 20) {
			timeOfTheDay = "evening";
		} else if (time >= 21 && time <= 24) {
			timeOfTheDay = "night";
		} else {
			timeOfTheDay = "invalid value";
		}

		System.out.println(timeOfTheDay);
	}

}
