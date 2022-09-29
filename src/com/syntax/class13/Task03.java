package com.syntax.class13;

import java.util.Arrays;

public class Task03 {

	public static void main(String[] args) {
		// You have a String a = " Is it Saturday? Is it raining? Do we have a Java Class Today?"
		// How would you find out how many sentences are in that String?"

		String text = " Is it Saturday? Is it raining? Do we have a Java Class Today?";
		String[] textArray = text.split("[?]");
		System.out.println(Arrays.toString(textArray));
		int size = textArray.length;
		System.out.println("The size of this array is " + size);
	}
}
