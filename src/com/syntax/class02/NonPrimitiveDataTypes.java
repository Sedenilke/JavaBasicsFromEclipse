package com.syntax.class02;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// String is one of the nonprimitive data type. It Started with Upper case
		// different than primitive data types.

		String name = "Asma"; // bu variablelari kullanmadigim surece numaralarin yanlarinda sari isik
								// yaniyor. Bunu tanimladin ama niye kullamadin diyor Java
		String address = "123 address street"; // combination of number and alpha characters
		int phone = 1234560; // just numbers are ok to represent it with int data type, but if you want to
								// add - between the numbers you need to change the data type
		String phone1 = "123 56 89"; // bu artik string
		int age = 17;
		String age1 = "17";
		// age1 * 10; System cannot perform that because age1 is stored as String not a
		// number

		// syso + ctrl + space and enter bu System.outprintln() yazisini otomatik olarak
		// getiriyor.
		System.out.println(name);

		// concatage iki String'i bir araya getirme
		System.out.println("My name is " + name);

		// Asma is 17
		System.out.println(name + " is " + age);

		String fruit = "apple";
		double price = 1.99;
		// the price of the apple is 1.99
		System.out.println("The price of the " + fruit + " is " + price + ".");
		// to attach any value (int, boolean, char, etc. to String we use + , + next to
		// the String acts as Concatenate - birlestirmek//

		// Now, I want to write: The price of the mango is 3.99
		fruit = "mango";
		price = 3.99;

		System.out.println("The price of the " + fruit + " is " + price + ".");

	}

}
