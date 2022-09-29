package com.syntax.class08;

public class NestedLoop {
//car odometer
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
		// Multiplivation table
		for (int x = 0; x <= 9; x++) {

			System.out.println("Let's look at for multiplication by " + x);
			for (int y = 0; y <= 9; y++) {
				int out = x * y;
				System.out.println(x + "*" + y + " = " + out);
			}

		}

	}

}
