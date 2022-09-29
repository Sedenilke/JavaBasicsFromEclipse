package com.syntax.class10;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// [row][column]
		int[][] bigArray = new int[3][4]; // first one is for # of rows, second one is for # of columns.
		// row 1
		bigArray[0][0] = 10;
		bigArray[0][1] = 20;
		bigArray[0][2] = 30;
		bigArray[0][3] = 40;

		// row 2
		bigArray[1][0] = 100;
		bigArray[1][1] = 200;
		bigArray[1][2] = 300;
		bigArray[1][3] = 400;

		// row 3
		bigArray[2][0] = 1;
		bigArray[2][1] = 2;
		bigArray[2][2] = 3;
		bigArray[2][3] = 4;

		// how to access elements from 2D array?
		System.out.println(bigArray[1][2]);

		int[][] newArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		/*
		 * my first array: {1,2,3} my second array: {4,5,6} my third array: {7,8,9}
		 */
		// to access 4
		System.out.println(newArray[1][0]);
	}

}
