package Group2Project;

import java.util.*;

public class Task10 {

	public static void main(String[] args) {
		// DONE
		// Write a java program to find the second largest number in the array?

		int[] numArray = {380, 234567, 123456, 1237658, 56179, 435679, 7433};

		int largest = numArray[0];
		int smallest = numArray[0];

		for (int i = 1; i < numArray.length; i++) {
			if (largest <= numArray[i]) {
				largest = numArray[i];
			}

			if (smallest >= numArray[i]) {
				smallest = numArray[i];
			}
		}
		System.out.println("The largest element in your array is: " + largest);
		System.out.println("The smallest element in your array is: " + smallest);

		int secondLargest = smallest;

		for (int j = 0; j < numArray.length; j++) {
			if (numArray[j] != largest) {
				if (secondLargest <= numArray[j]) {
					secondLargest = numArray[j];
				}
			}
		}
		System.out.println("The second largest element in your array is: " + secondLargest);
	}
}
