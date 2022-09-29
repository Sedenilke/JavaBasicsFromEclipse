package Group2Project;

import java.util.Scanner;

public class Task11b {

	public static void main(String[] args) {

		// User decides the number of elements as well as the elements:
		Scanner input = new Scanner(System.in);
		// User decides the number of elements that s/he wants to store
		System.out.println("How many words do you want to store?");
		int numberOfEl = input.nextInt();

		// declare and initialize the array:
		String[] userArray = new String[numberOfEl];

		for (int i = 0; i <= numberOfEl - 1; i++) {
			// if it is the last number:
			if (i == numberOfEl - 1) {
				System.out.println("Please enter your last word: ");
				userArray[i] = input.next();
				// for all other number entries:
			} else {
				System.out.println("Please enter your word: ");
				userArray[i] = input.next();
			}
		}
		System.out.println("Here is the list of your words: ");
		for (String elements : userArray) {
			System.out.print(elements + " ");
		}
		System.out.println();
		int count = 0;

		for (int i = 0; i < userArray.length; i++) {
			for (int j = i + 1; j < userArray.length; j++) {
				if (userArray[i].equals(userArray[j])) {
					System.out.print(userArray[i] + " ");
					count++;
				}
			}
		} 
		if (count==1) {
		System.out.print( "is the repeating word in your list.");
		}
		else if (count>1) {
			System.out.print( "are the repeating words in your list.");
		}
		else {
				System.out.println("There is no repeating word in your list. ");
			}
		
			System.out.println();
			System.out.println("--------------------------");
		}
	}

