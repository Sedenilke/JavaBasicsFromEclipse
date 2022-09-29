package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		int time = 5;
		String day = "Monday";

		if (day.equals("Monday")) {
			/*
			 * It is called outer if-condition. If it is true than only inner conditions
			 * will be checked, if it is false we pass the whole if part and continue with
			 * the outside of the if part. It is like main gate. Matruska ornegi verdik
			 * burada.
			 */
			if (time > 7) {
				System.out.println("Lets go to office");
			}
			if (time < 6) {
				System.out.println("Let's sleep more");
			}
		}

		double moneyInMyAccount = 100000;
		String season = "Spring";

		if (season.equals("Spring")) {
			if (moneyInMyAccount > 30000) {
				System.out.println("I can go to vacation");
			} else {
				System.out.println("I need to save more money to go to vacation");
			}
		} else {
			System.out.println("You need to wait for Spring");
		}

	}

}
