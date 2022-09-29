package Group2Project;

public class Task06 {

	public static void main(String[] args) {
		//DONE
		// Write a program to swap 2 numbers without a temporary variable?
		
		int x = 5;
		int y = 10;
		System.out.println("Original numbers:");
		System.out.println("x: " + x + ",  y: " + y);
		
		x = x + y; // x = 15
		y = x - y; // y = 15 - 10// y = 5
		x = x - y; // x = 15, from 15 - 5  x = 10;
		
		System.out.println("After swapping the numbers:");
		System.out.println("x: " + x + ", y: " + y);

	}

}
