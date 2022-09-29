package com.syntax.class12;

public class Task02 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters,
		//print the character in the middle of the String.
		//don't print anything if other cases happen
		// For example: str ="Hello" --> program should print out "l"

		String input = "Seden";
		int sizeOfString = input.length();
		int middleChar = input.length()/2;
		if(!input.isEmpty()) {
			if(!(sizeOfString %2 == 0) && (sizeOfString>=3)) {
				System.out.println(input.charAt(middleChar));
			}
		}
	}
}
