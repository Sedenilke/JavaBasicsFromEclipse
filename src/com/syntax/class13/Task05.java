package com.syntax.class13;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true, Abbc =>false
		Scanner obj = new Scanner(System.in);
		System.out.print("Input:");
		String givenString = obj.nextLine();
		boolean palindrome = true;
		String givenStringWithoutSpace = givenString.replaceAll(" ", "");
		String givenStringWithoutSpaceAndLowerCase = givenStringWithoutSpace.toLowerCase();
		// for test:
		//System.out.println(givenStringWithoutSpaceAndLowerCase);

		int indexOflastElement = givenStringWithoutSpaceAndLowerCase.length() - 1;

		for (int i = 0; i < givenStringWithoutSpaceAndLowerCase.length() / 2; i++) {
			if (givenStringWithoutSpaceAndLowerCase
					.charAt(i) != (givenStringWithoutSpaceAndLowerCase.charAt(indexOflastElement - i))) {
				palindrome = false;
				System.out.println("false");
				break;
			}
		}
		if (palindrome) {
			System.out.println("true");
		}
	}
}
