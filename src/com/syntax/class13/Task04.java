package com.syntax.class13;

import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		// How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever

		String sentence = "Autum is here";
		String[] words = sentence.split(" ");
		String reverseWord = " ";
		for (String elements: words) {
			StringBuilder obj = new StringBuilder(elements);
			obj.reverse();
			reverseWord = reverseWord + obj.toString() + " ";
		}
		System.out.println(reverseWord.trim());
	}
}
