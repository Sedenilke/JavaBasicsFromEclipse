package com.syntax.class06;

import java.util.Scanner;

public class IntroduceTheVariableUsingHwQuestions {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Which month were you born in?");
		String month = obj.nextLine();

		String season;
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			season = "Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Fall";
		}

		else {
			season = "invalid";
		}
			if (!season.equals("invalid")) {
				System.out.println("You were born in " + season);
			} else {
				System.out.println("Please enter a valid month");
			}

		}

	}

