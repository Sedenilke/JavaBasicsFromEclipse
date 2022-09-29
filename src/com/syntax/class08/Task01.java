package com.syntax.class08;

public class Task01 {

	public static void main(String[] args) {
		// Please find the sum and all odd numbers between 1 and 50
		int sumEven = 0;
		int sumOdd = 0;

		for (int num = 1; num <= 50; num++) {
			if (num % 2 == 0) {
				sumEven = sumEven + num;
			} else {
				sumOdd = sumOdd + num;
			}
		}
		System.out.println("The sum of even numbers from 1 to 50 is: " + sumEven);
		System.out.println("The sum of odd numbers from 1 to 50 is: " + sumOdd);
	}

}
