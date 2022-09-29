package com.syntax.class09;

public class Day09Hw01 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it.
		// Using 2 different loops print all values from the array.

		String[] cars = { "Honda", "Toyota", "Hyundai", "BMW", "Mercedes", "Audi" };
		int size = cars.length;

		for (int i = 0; i < size; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println("");
		System.out.println("----------------");

		for (String brandNamesOfCars : cars) {
			System.out.print(brandNamesOfCars + " ");
		}
		System.out.println("");
		System.out.println("----------------");

	}

}
