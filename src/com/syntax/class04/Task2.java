package com.syntax.class04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Take the name, age, address as an input and print them out
		
		Scanner newObj = new Scanner(System.in); 
		Scanner newObj1 = new Scanner(System.in);

		
		System.out.println("Please enter your full name: ");
		String userFullName = newObj.nextLine();
		
		System.out.println("Please enter your age: ");
		int userAge = newObj.nextInt();
		
		System.out.println("Please enter your address: ");
		String userAddress = newObj1.nextLine();
		
		
		System.out.println("Hello " + userFullName + " we see that you are " + userAge + " and you live in " + userAddress);
			
	}

}
