package Group2Project;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// DONE
		// Create a 2D array of integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.

		System.out.println("Please enter the size of an array");
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
    }

}
