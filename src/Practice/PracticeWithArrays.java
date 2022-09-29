package Practice;

public class PracticeWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int theLargestElement = myArray[0];
		int theSmallestElement = myArray[0];

		for (int elements : myArray) {
			if (elements > theLargestElement) {
				theLargestElement = elements;
			}
		}

		for (int elements : myArray) {
			if (elements < theSmallestElement) {
				theSmallestElement = elements;
			}
		}
		int sum = 0;
		double average = 0;
		for (int elements : myArray) {
			sum = sum + elements;
			average = sum/myArray.length;
		}
		
		System.out.println("The largest element of the array is " + theLargestElement);
		System.out.println("The smallest element of the array is " + theSmallestElement);
		System.out.println("The sum of the elements in this array is " + sum);
		System.out.println("The average of the elements of the array is " + average);
	}

}
