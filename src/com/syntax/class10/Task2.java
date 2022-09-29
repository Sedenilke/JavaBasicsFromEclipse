package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// Create a 2D array(shorter way) in which first array will consist of 4 names
		// and second array will contain grades.
		// Then your program should print name of the students that has A and B grade

		String[][] students = { { "Student1", "Student2", "Student3", "Student4" }, { "A", "B", "C", "D" } };

		System.out.println(students[0][0] + " = " + students[1][0]);
		System.out.println(students[0][1] + " = " + students[1][1]);
		
		for(int row=0; row< students.length; row++) {
			for(int column=0; column<students[row].length; column++) {
				System.out.print(students[row][column] + " ");
			}
			System.out.println();
		}

	}

}
