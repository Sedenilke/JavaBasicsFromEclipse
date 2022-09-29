package com.syntax.class06;

import java.util.Scanner;

public class Day6HwPart1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		Scanner obj = new Scanner(System.in);
		System.out.println("Where are you from? (Your word should start with capital letter.)");
		String country = obj.nextLine();
		String language;

		switch (country) {
		case "Italy":
			language = "Italian";
			break;
		case "Spain":
			language = "Spanish";
			break;
		case "Germany":
			language = "German";
			break;
		case "France":
			language = "French";
			break;
		case "India":
			language = "Hindi";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		default:
			System.out.println("We could not find this country in our list, please try another one.");
			language = "Unknown";
			break;
		}
		if (!language.equals("Unknown")) {
			System.out.println("You are from " + country + " and you speak " + language + ".");

		}
	}

}
