package Group2Project;

import java.util.Scanner;

public class Task01b {

	public static void main(String[] args) {
		// DONE

		Scanner input = new Scanner(System.in);
		// User decides the number of elements that s/he wants to store
		System.out.println("How many numbers do you want to store?");
		int numberOfEl = input.nextInt();
		int sum = 0; // sum of the elements in the array

		// declare and initialize the array:
		int[] numberArray = new int[numberOfEl];

		for (int i = 0; i <= numberOfEl - 1; i++) {
			//if it is the last number:
			if (i == numberOfEl - 1) {
				System.out.println("Please enter your last number: ");
				numberArray[i] = input.nextInt();
			//for all other number entries:
			} else {
				System.out.println("Please enter your number: ");
				numberArray[i] = input.nextInt();
			}
		}
		//we created the array, now we will all the elements:
		for (int j = 0; j < numberArray.length; j++) {
			sum += numberArray[j];
		}
		//Information about how many elements we entered and what their total is:
		System.out.println("You entered " + numberOfEl + " numbers and here is your total: " + sum);
	}
}
