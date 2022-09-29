package Group2Project;

public class Task05 {

	public static void main(String[] args) {
		//DONE
		// Create a 2D array of integers.
		// Develop a program which will calculate the sum of even and odd numbers for
		// that array.
		int evenSum = 0;
		int oddSum = 0;

		int[][] number = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 }, { 12, 14 } };

		for (int[] r : number) {
			for (int c : r) {
				if (c % 2 == 0) {
					evenSum += c;
				} else {
					oddSum += c;
				}
			}
		}
		System.out.println("Sum of even numbers in your array: ");
		System.out.print(evenSum + " ");
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Sum of odd numbers in your array: ");
		System.out.print(oddSum + " ");
	}
}