package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo02 {

	public static void main(String[] args) {
		/*
		 * we need to ask a user where s/he is from based on the country --> define
		 * favorite food
		 */

		Scanner obj = new Scanner(System.in);
		System.out.println("Where are you from?");
		String country = obj.nextLine();
		String favoriteFood;

		switch (country) {
		case "USA":
			favoriteFood = "Burgers and Fries";
			break;

		case "Kazakhstan":
			favoriteFood = "Beshparmak";
			break;

		case "Turkey":
			favoriteFood = "Adana Kebap";
			break;

		case "Venezuela":
			favoriteFood = "Arepa";
			break;
		case "India":
			favoriteFood = "Chicken Curry";
			break;
		case "Yemen":
			favoriteFood = "Mandi";
			break;
		case "Afganishtan":
			favoriteFood = "Qaboli Palow";
			break;
		default:
			favoriteFood = "Unknown";
			break;
		}
		System.out.println("You are from " + country + " and your favorite food is " + favoriteFood);
	}

}
