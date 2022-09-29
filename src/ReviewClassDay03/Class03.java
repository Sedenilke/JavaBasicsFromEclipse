package ReviewClassDay03;

import java.util.Scanner;

public class Class03 {

	public static void main(String[] args) {
		/*
		 * Logical Operators: Logical operators help us test more than one conditions.
		 * In Java we have && as the AND operator and || as the OR and ! NOT. Why we
		 * should learn logical operators? Logical operators help us reduce the number
		 * of if-conditions that we write in certain cases. What is the syntax?
		 * if(condition1 && condition2) { } --> bunun yerine nested if kullanabilirim
		 * if(condition1) { if(condition2) { } }
		 */

		boolean programmer = false;
		boolean manualTester = true;
		boolean knowFrameWork = true;

		if (programmer && manualTester && knowFrameWork) {
			System.out.println("You can be an automation engineer");
		} else {
			System.out.println("You must know a programming language "
					+ "manual testing and framework to be an automation engineer.");
		}

		boolean iceCream = true;
		boolean fruit = true;
		boolean tacoTruck = false;
		if (iceCream || fruit || tacoTruck) {
			System.out.println("I am good for midnight snack");
		} else {
			System.out.println("I should buy something for midnight snack");
		}

		double savings = 200000;
		boolean freeTime = true;
		String season = "Summer";

		if (savings > 10000 && freeTime && season.equalsIgnoreCase("summer")) {
			System.out.println("Let's go to Bora Bora");
		} else {
			System.out.println("I need time and money");
		}

		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter if you are comfortable with java logical operators now.");
		boolean goodWithOp = obj.nextBoolean();

		if (!goodWithOp) {
			System.out.println("Do some research solve some repls and take some rest");
		}

	}

}
