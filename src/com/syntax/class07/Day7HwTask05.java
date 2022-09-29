package com.syntax.class07;

import java.util.Scanner;

public class Day7HwTask05 {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner obj = new Scanner(System.in);
		String name = null;
		for (int i = 1; i <= 3; i++) {
			System.out.println("What is your name?");
			name = obj.nextLine();
			System.out.println("Good afternoon " + name);
		}
		
	}

}
