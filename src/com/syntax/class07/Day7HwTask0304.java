package com.syntax.class07;

public class Day7HwTask0304 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		// using for:
		for (int number1 = 20; number1 >= 1; number1 -= 2) {
			System.out.print(number1 + " ");
		}
		System.out.println("------------------");
		// using while
		int num1 = 20;
		while (num1 >= 1) {
			if (num1 % 2 == 0) {
				System.out.print(num1 + " ");
			}
			num1--;
		}
		System.out.println("------------------");

		// Print odd numbers between 20 and 50 (2 ways)
		// using for:
		for (int number2 = 21; number2 <= 49; number2 += 2) {
			System.out.print(number2 + " ");
		}
		System.out.println("------------------");
		// using while:
		int num2 = 20;
		while (num2 <= 50) {
			if (num2 % 2 == 1) {
				System.out.print(num2 + " ");
			}
			num2++;
		}
		System.out.println("------------------");
	}

}
