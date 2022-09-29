package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 */
		char[] charElements = new char[6];
		charElements[0] = 'A';
		charElements[1] = 'B';
		charElements[2] = 'C';
		charElements[3] = 'D';
		charElements[4] = 'E';
		charElements[5] = 'F';
		System.out.println(charElements[1]);
		System.out.println("-----------------------------");

		char[] charElements1 = { 'A', 'B', 'C', 'D', 'E', 'F' };
		int sizeChar = charElements1.length;
		System.out.println(charElements1[1]);
		System.out.println("-----------------------------");

		for (int j = 0; j < sizeChar; j++) {
			System.out.print(charElements1[j] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");

		/*
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 */

		String[] names = new String[3];
		names[0] = "Seden";
		names[1] = "Ilke";
		names[2] = "Pekiner";
		int size = names.length;
		System.out.println(names[1]);
		System.out.println("-----------------------------");

		String[] names1 = { "Seden", "Ilke", "Pekiner" };
		System.out.println(names1[1]);
		System.out.println("-----------------------------");

		for (int i = 0; i < size; i++) { //!!!!!!!burada mutlaka array.length kullan, i<4 deme, sayi yerine, cunku sonradan arrayin eleman sayisini degistirebilirsin.
			System.out.print(names[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------");

		/*
		 * Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using elements of array: “Saturday is Java coding Day”
		 */
		String[] words = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
	}
}
