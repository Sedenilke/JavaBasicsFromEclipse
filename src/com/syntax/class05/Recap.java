package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		/*
		 * short to auto complete: ctrl+space we write "main" and then click on ctrl and
		 * press space than it automatically brings then all the options from Java
		 * Library and I choose public static void main.... f from there
		 */

		/*
		 * if always check a condition if has three versions: only if, if + else if and
		 * if+else if+else
		 */

		/*
		 * to import a class short cut is ctrl + shift + o // if always checks a boolean
		 * value whether it is true or false
		 * 
		 * boolean weekend = true; if (weekend) {
		 * System.out.println("It is Java Class"); }
		 * 
		 * String day = "Saturday"; if (day.equals("Saturday")) {
		 * System.out.println("It is Java class"); }
		 * 
		 * int date = 3; if (date == 3) { System.out.println("Today is the third"); }
		 * 
		 * String phone = "Samsung"; if (phone.equals("Iphone")) {
		 * System.out.println("I want to but it for me"); } else if
		 * (phone.equals("Samsung")) {
		 * System.out.println("I want to buy it for my husband"); } else if
		 * (phone.equals("Nokia")) {
		 * System.out.println("I want to buy it for my grandma"); } else {
		 * System.out.println("That is not the phone I was looking for"); }
		 * 
		 * /* nested if- if statement inside another if In a doctor visit they ask
		 * whether you use any kind of medication, if you choose yes than they ask what
		 * kind of medication you use. if you say "No" than you skip that part fully
		 */
		boolean allergy = true;
		String allergyType = "Peanut";
		/*
		 * if I want to ignore the first letter is capital or small, I add
		 * .equalsIgnoreCase, so if you write Peanut or peanut it will be the same.
		 */

		if (allergy) {
			System.out.println("Let's check what alergy you have");
			if (allergyType.equals("Pollen")) {
				System.out.println("Try to stay indoors");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");

			} else if (allergyType.equals("Dairly")) {
				System.out.println("Stay away from dairy products");
			} else {
				System.out.println("We need to do some test");
			}
		} else {
			System.out.println("You are lucky");
		}

		/*
		 * input.nextInt() --> capture the scanner then int number = input.nextInt() -->
		 * assign this value to variable number whose data type is int
		 * input.next().charAt(0) --> capture the word(input.next()) than capture the
		 * first element of - it says that with charAt(0)
		 */
		System.out.println("Waht is your grade");
		Scanner input = new Scanner(System.in);

		char grade = input.next().charAt(0);
		System.out.println("Here is your grade " + grade);
		grade = input.next().charAt(4); // bu girilen degerin 5. elemanini gosterecek burada grade'i tekrar define
										// etmeme gerek yok
		System.out.println("Here is your grade " + grade);
		// next() only captures one word, nextLine() captures more than one word

	}

}
