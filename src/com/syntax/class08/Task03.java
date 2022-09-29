package com.syntax.class08;

public class Task03 {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3
		//with only if
		for (int i = 1; i <= 50; i++) {
			if (i % 3 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("--------------End--------------");
		//with continue
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println("--------------End--------------");

	}
}