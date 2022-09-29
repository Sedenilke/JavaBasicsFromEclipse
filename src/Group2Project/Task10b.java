package Group2Project;

public class Task10b {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] numArray = { 1231241288, 1231288141, 12312414, 1412412481, 56179, 1231418, 1231231712 };

		int largest = numArray[0];
		int secondLargest = numArray[1];

		for (int i = 1; i < numArray.length; i++) {
			if (largest <= numArray[i]) {
				largest = numArray[i];
			}
		}
		System.out.println("The largest element in your array is: " + largest);

		for (int j = 0; j < numArray.length; j++) {
			if (numArray[j] == largest) {
				continue;
			} else {
				if (secondLargest <= numArray[j]) {
					secondLargest = numArray[j];
				}
			}
		}
		System.out.println("The second largest element in your array is: " + secondLargest);
	}
}
