package com.syntax.class09;

public class Day09Hw04 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.

		int[] numbers = { 7, 9, 12, 4, 1 };
		int size = numbers.length;
		int largest = numbers[0];

		for (int elementsOfNumbersArray : numbers) {
			if (largest <= elementsOfNumbersArray) {
				largest = elementsOfNumbersArray;
			}
		}
		System.out.println("The largest element of your array is: " + largest);
	}
}
