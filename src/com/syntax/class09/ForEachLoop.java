package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// only when we work with arrays or collections
		// we can use for each loop, enhanced for loop, advanced for loop
		String[] iceCream = { "Vanilla", "Chocolate", "Mint", "Mango" };
		// for (each element is which type? name :which array do you want me to look)
		/*
		 * "name" stores each elements inside the array one by one.
		 */

		for (String flavor : iceCream) {
			System.out.println(flavor); //
			/*
			 * grap first element: vanilla and print out, go back to for loop, is there any
			 * elements after vanilla, yes, then grap it and store it inside flavor, print
			 * out Chocolate, than go back to for loop. repeat the steps. when it comes to
			 * mango, it checks there is no more elements left so it stops after mango..
			 */
		}
		System.out.println("-------------------");
		char[] charElements = { 'A', 'B', 'C', 'D', 'E', 'F' };
		for (char elements : charElements) {
			System.out.print(elements + " ");
		}
		System.out.println("");
		System.out.println("----------------");

		int[] numbers = { 12, 56, 345, 1, 0, 9 };
		// get all elements using regular for loop

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
		System.out.println("----------------");
		/*enhanced loop is smart, it knows where to start, where to stop, during the run time we don't run any type of error.
		*for "for loop" if we say i<=arra.length we run into run-time error. Because we are trying to call an element which is 
		*not there.
		*but downside of this loop is it only works one way. from beginning to end. we can not print out the elements from the last
		*element to first element
		 */
		for (int i : numbers) {
			System.out.print(i + " ");

		}

	}
}
