package com.syntax.class05;

import java.util.Scanner;

public class Day5HwPart2 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Which month were you born in?");
		String month = obj.nextLine();

		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			System.out.println("You were born in Winter");
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			System.out.println("You were born in Spring");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			System.out.println("You were born in Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			System.out.println("You were born in Fall");
		}
		else {
			System.out.println("Please enter a valid month");
		}
	}
}
