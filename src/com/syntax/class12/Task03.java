package com.syntax.class12;

public class Task03 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).

		String testValue = "Monday and  Friday are week days";
		int size = testValue.length();
		int lastElIndex = testValue.length() - 1;
		for (int i = lastElIndex; i >= 0; i--) {
			System.out.print(testValue.charAt(i));
		}
	}

}
