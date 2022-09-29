package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/* In the below line: Scanner is a class that helps us take the input from keyboard.
		 * it contains many different smaller modules called methods that helps us
		 * take Strings booleans basically all types of data from the keyboard.
		 */
		Scanner input = new Scanner (System.in);
		
		/*in the below line: A message will be displayed to the 
		 * user on the console to enter his/her name
		 */
		System.out.println("Please enter your name: ");
		
		/*In the below line: Activates the java program 
		 * to take the input from keyboard and store it 
		 * inside the name variable
		 */
		String name = input.next(); /* next() only excepts the one word, if I write seden pekiner, it will 
		show only Seden, nextline() takes the whole line. */
		
		/*prints whatever name user enters on the keyboard on the console*/
		System.out.println("Hello " + name);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter any sentence:  ");
		String sentence = scanner.nextLine();
		System.out.println(sentence);
	}

}
