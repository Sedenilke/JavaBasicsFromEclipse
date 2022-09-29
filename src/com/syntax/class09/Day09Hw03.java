package com.syntax.class09;

public class Day09Hw03 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array.
		
		int[] numbers = {1, 2, 3, 4, 5};
		int size = numbers.length;
		int sum = 0;

		for (int elementsOfNumbersArray : numbers) {
			sum += elementsOfNumbersArray;
		}
		System.out.println("Sum of the elements in your array is: " + sum);
	}
}
