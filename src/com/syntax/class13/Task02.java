package com.syntax.class13;

import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers, and special characters.
		//Find out how many Alphanumeric(abd AZ284) characters are there in the String 
		
		String testSentence = "abcdefghABCDEFGH123456789!@#$%^&*";
		String onlyAlphanumeric = testSentence.replaceAll("[^a-zA-Z0-9]","");
		//to test whether I pull the correct elements:
		System.out.println(onlyAlphanumeric);
		char [] arrayAlphanumeric = onlyAlphanumeric.toCharArray();
		//to test whether I create the array correctly:
		//System.out.println(Arrays.toString(arrayAlphanumeric));
		int size = arrayAlphanumeric.length;
		System.out.println("There are " + size + " Alphanumeric elements in your array.");
	
	}

}
