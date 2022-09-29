package com.syntax.class09;

public class Day09Hw05 {

	public static void main(String[] args) {
		// Create an array to store char values and then print those in reverse order.
		
		char [] values = {'R','E','V','E','R','S','E','O','R','D','E','R'};
		int size = values.length;
		
		for(int i=size-1; i>=0; i--) {
			System.out.print(values[i] + " ");
		}
	}
}
