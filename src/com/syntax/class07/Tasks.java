package com.syntax.class07;

public class Tasks {

	public static void main(String[] args) {
		// Print numbers 100 to 1
		System.out.print("Print numbers 100 to 1: ");
		int num = 100;
		while (num >= 1) {
			System.out.print(num + " ");
			num--;
		}
		System.out.println("-----------------");

		// Print even numbers from 20 to 100
		System.out.print("Print even numbers from 20 to 100: ");
		int num2 = 20;
		while (num2 <= 100) {
			System.out.print(num2 + " ");
			num2 += 2;
		}
		System.out.println("-----------------");

		// print only odd numbers from 100 to 1-one way
		System.out.print("Print only odd numbers from 100 to 1: ");
		int num3 = 99;
		while (num3 >= 1) {
			System.out.print(num3+ " ");
			num3 -= 2;
		}
		System.out.println("-----------------");
		System.out.print("Print only odd numbers from 100 to 1: ");
		// print only odd numbers from 100 to 1-another way
		int num4 = 100;
		while (num4 >= 1) {
			if (num4 % 2 == 1) {
				System.out.print(num4 + " ");
			}
			num4--;
		}
	}

}
