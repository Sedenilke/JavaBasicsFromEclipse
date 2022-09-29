package Group2Project;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		//DONE
		// Using Scanner create an array of integer values.
		// After the array is created, calculate the sum of all stored elements in that
		// array.

		// with fixed array size:
		int[] values = new int[5];
		Scanner value = new Scanner(System.in);
		System.out.println("Please enter 5 numbers one by one: ");
		System.out.println("First element of the array: ");
		values[0] = value.nextInt();
		System.out.println("Second element of the array: ");
		values[1] = value.nextInt();
		System.out.println("Third element of the array: ");
		values[2] = value.nextInt();
		System.out.println("Fourth element of the array: ");
		values[3] = value.nextInt();
		System.out.println("Last element of the array: ");
		values[4] = value.nextInt();

		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		System.out.println("Here is the sum of the elements in your array: " + sum);
	}
}
/* Code from dusan:  System.out.println("Please enter the size of an array");
Scanner scan= new Scanner(System.in);

int size=scan.nextInt();

int [] array = new int[size];
int sum=0;

System.out.println("Please enter elements one by one");

for(int i=0; i<size; i++) {
    array[i]=scan.nextInt();
    sum+=array[i];

}

System.out.println("Sum of the elements is "+ sum);
*/