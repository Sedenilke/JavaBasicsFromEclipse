package Group2Project;

public class Task09 {

	public static void main(String[] args) {
		//DONE
		// Maximum and minimum number in the array?
		int[] numArray = {124567, 1245678, 1241234, 122344, 12343524, 13453424, 124 };

		int largest = numArray[0];
		int smallest = numArray[0];

		for (int i = 1; i < numArray.length; i++) {
			if (largest < numArray[i]) {
				largest = numArray[i];
			}

			if (smallest > numArray[i]) {
				smallest = numArray[i];
			}
		}
		System.out.println("The largest element in your array is: " + largest);
		System.out.println("The smallest element in your array is: " + smallest);
	}
}
