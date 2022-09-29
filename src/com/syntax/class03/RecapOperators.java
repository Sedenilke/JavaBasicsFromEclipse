package com.syntax.class03;

public class RecapOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Addition --> + Subtraction --> - Multiplication --> * Division --> / Modulus
		 * --> %
		 */

		int number1 = 10;
		int number2 = 5;
		System.out.println(number1 / number2); // diving number1 by number2

		number1 = 9;
		number2 = 2;
		System.out.println("Answer: " + number1 / number2); // Answer will be 4 here. Because we defined 9 and 2 as
															// integer.
		System.out.println("Remainder: " + number1 % number2);
		/*
		 * System.out.println("Answer: " + number1-number2); it complains if we don't
		 * write number1 - number2 into the paranthesis. same happens with addition
		 * System.out.println("Answer: " + number1+number2)
		 */

		double number3 = 9;
		double number4 = 2;
		System.out.println(number3 / number4); // Answer will be 4.5 here. Because we defined 9 and 2 as double.

		double number5 = 1;
		double number6 = 3;
		System.out.println(number5 / number6); // Answer will be 0.33333333333333 here.

		float number7 = 1;
		float number8 = 3;
		System.out.println(number7 / number8); // Answer will be 0.333334 here.
	}

}
