package com.syntax.class10;

public class EnhancedLoopFor2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] students = { { "Student1", "Student2", "Student3", "Student4" }, { "A", "B", "C", "D" } };

		for (String[] singleArray : students) { // when I go inside the 2D array, the elements of 2D array is single
												// arrays.
			for (String elements : singleArray) {
				System.out.print (elements + " ");
			}
			System.out.println();
		}
	}
}
