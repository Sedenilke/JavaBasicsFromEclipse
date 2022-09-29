package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
		 * short (under 60 inch)
		 * medium(between 60 -72 inch)
		 * tall (over 72 inch)
		*/
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter your height: ");
		double height = obj.nextDouble();
		
		if(height<60) { 
			System.out.println("You are short.");
		}
		else if (height>=60 && height < 72) {
			System.out.println("You are medium.");
		}
		else if(height>=72) {
			System.out.println("You are tall.");
		}
	}

}
