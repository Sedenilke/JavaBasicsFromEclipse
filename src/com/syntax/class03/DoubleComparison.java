package com.syntax.class03;

public class DoubleComparison {

	public static void main(String[] args) {
		/*
		 * HW Part 1: Create a Java program and name it Double Comparison. Declare 2
		 * double values and if value of first variable is higher then the second, print
		 * “Double value is larger than .” Otherwise print...
		 */

		System.out.println("Double Comparision:");
		double num1 = 3.145678;
		double num2 = 3.145679;

		if (num1 > num2) {
			System.out.println("Double value" + " " + num1 + " is larger than " + "double value " + num2);
		} else {
			System.out.println("Double value" + " " + num2 + " is larger than " + "double value " + num1);
		}

		System.out.println("----------------------------");

	}

}
