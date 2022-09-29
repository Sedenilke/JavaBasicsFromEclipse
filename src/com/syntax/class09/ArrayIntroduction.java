package com.syntax.class09;

public class ArrayIntroduction {

	public static void main(String[] args) {
		// int a; --> I ask Java to create a container for my integer
		// value.(decleration)
		// int[] a --> I ask Java to create a bigger container for my integer
		// collection. (decleration)

		// declare and initialize
		int[] myArray = new int[4];

		// store the elements:
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;

		// accessing elements from the array
		System.out.println(myArray[2]); // 30
		System.out.println(myArray[1] + myArray[2]); // 50

		// lets create an array and store your classmates
		String[] names = new String[5];
		names[0] = "Shah";
		names[1] = "Vera";
		names[2] = "Roman";
		names[3] = "Guljan";
		names[4] = "Zamanullah";

		System.out.println("Hello " + names[1]); // Hello Vera

	}

}
