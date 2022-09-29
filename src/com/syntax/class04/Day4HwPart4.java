package com.syntax.class04;

import java.util.Scanner;

public class Day4HwPart4 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */
		Scanner obj = new Scanner(System.in);

		System.out.println("Please type your age: ");
		int age = obj.nextInt();
		
		if (age >= 18) {
			System.out.println("We can issue your driver license.");
		} else {
			System.out.println("We only offer you to get a learners permit right now.");
			
		}

	}

}
