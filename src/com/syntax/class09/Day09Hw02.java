package com.syntax.class09;

public class Day09Hw02 {

	public static void main(String[] args) {
		// Create an array of animals and store 5 elements into it.
		// Using 2 different loops print all elements from the array.
		
		String[] animals = { "Dog", "Cat", "Bird", "Fish", "Horse"};
		int size = animals.length;

		for (int i = 0; i < size; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println("");
		System.out.println("----------------");

		for (String typesOfAnimals : animals) {
			System.out.print(typesOfAnimals + " ");
		}
		System.out.println("");
		System.out.println("----------------");
	}

}
