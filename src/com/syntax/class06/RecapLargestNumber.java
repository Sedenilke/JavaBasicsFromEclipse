package com.syntax.class06;

public class RecapLargestNumber {

	public static void main(String[] args) {
		/*
		 * in the below code if we do not initialize largest number at the beginning,
		 * and all three cases are not correct Compiler throws an error like what the
		 * largest number will be that you want me to print out. Compiler saves us,
		 * before it sends the code to Java it checks for us and asks some corrections
		 * if needed. To prevent this situation, we need to initialize the variable
		 * first. for boolean valur default is "false" for int value default is "0" for
		 * double value default is "0.0" for String default value is "null"
		 * 
		 * 
		 */
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		int largest = 0; // if all values are equal, on line 29'da yazacak birsey bulamiyor java.
		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		System.out.print(largest + " is the larges number and ");
		if (largest % 2 == 0) {
			System.out.println("is an Even number.");
		} else {
			System.out.println("is an Odd number.");
		}

	}

}
