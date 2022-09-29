package com.syntax.class13;
public class Task06 {

	public static void main(String[] args) {
		// How would you swap 2 strings without a temporary variable?
		String firstWord = "Hello";
		String secondWord = "There";

		// Print String before swapping
		System.out.println("Strings before swap: ");
		System.out.println("First Word = " + firstWord);
		System.out.println("Second Word = " + secondWord);

		firstWord = firstWord + secondWord;
		//System.out.println(firstWord); 
		//store initial string firstWord in string secondWrod
		secondWord = firstWord.substring(0, firstWord.length() - secondWord.length());

		// store initial string secondWord in string firstWord
		firstWord = firstWord.substring(secondWord.length());
		System.out.println("-----------------");

		// print String after swapping
		System.out.println("Strings after swap: ");
		System.out.println("First Word = " + firstWord);
		System.out.println("Second Word = " + secondWord);
	}
}
