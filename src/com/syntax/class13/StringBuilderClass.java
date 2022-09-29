package com.syntax.class13;

public class StringBuilderClass {

	public static void main(String[] args) {

		StringBuilder newWord = new StringBuilder("Intellij is great!");
		System.out.println(newWord);
		String newWord2 = "hello there";
		
		System.out.println(newWord.reverse());

		// Asagidaki country, home, newCountry share the same id. When we debug, we see
		// that.
		String country = "USA";
		String home = "USA";
		String newCountry = new String("USA");
		// Asagidaki state and state2 have different id's

		StringBuilder state = new StringBuilder("New York"); // id is
		StringBuilder state2 = new StringBuilder("New York");

	}

}
