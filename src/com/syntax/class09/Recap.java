package com.syntax.class09;

public class Recap {
//what is the output of below code?
	public static void main(String[] args) {
		for (int i = 1; i < 4; i--) {
			for (int j = 0; j <= 2; j++) {
				System.out.println("Hello");
			}
			System.out.println("Bye");
			break;
		}
		// three pairs of hello-bye
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println("Hello");
				break;
			}
			System.out.println("Bye");

		}
		// only one pair of hello-bye
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println("Hello");
				break;
			}
			System.out.println("Bye");
			break;
		}
		// below code is an infinite loop, because condition is always true
		// boolean day=true;
		// for (int i = 1; i <=3; i++) {
		// while(day) {
		// System.out.println("Good Day");
		// }
		boolean day = false;
		for (int i = 1; i <= 3; i++) {
			while (day) {
				System.out.println("Good Day");
			}
			System.out.println(i);
		}
	}

}
