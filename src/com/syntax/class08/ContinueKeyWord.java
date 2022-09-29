package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {
			if (j == 3) {
				continue; // When certain condition meets, code skips the rest of the block for this value and go back to beginning of the for loop
			}
			System.out.println(j);
		}
		System.out.println("--------------End--------------");
		
		//I want to print all the numbers from 1 to 20 skipping 6,7 and 8
		for (int k = 1; k <= 20; k++) {
			if (k == 6 || k == 7 || k==8) {
				continue; // When certain condition meets, code skips the rest of the block for this value and go back to beginning of the for loop
			}
			System.out.print(k + " ");
		}
		System.out.println("--------------End--------------");
		
	}

}