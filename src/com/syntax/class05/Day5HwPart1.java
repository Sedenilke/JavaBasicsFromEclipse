package com.syntax.class05;

import java.util.Scanner;

public class Day5HwPart1 {

	public static void main(String[] args) {
		/*
		 * Write a program that will ask user to input inputs the current time (use 24
		 * hour format). Based on the given time define: if hour is between 1-11 -->
		 * Morning if hour between 12-15 --> Afternoon if hour between 16-20 --> Evening
		 * if hour between 21-24 --> Night
		 */

		Scanner obj = new Scanner(System.in);

		System.out.println("What time is it? (Please provide your answer as a whole number and using 24 hour format)");
		int time = obj.nextInt();

		if (time >= 1 && time <= 11) {
			System.out.println("It is morning.");
		} else if (time >= 12 && time <= 15) {
			System.out.println("It is afternoon.");
		} else if (time >= 16 && time <= 20) {
			System.out.println("It is evening.");
		} else if (time >= 21 && time <= 24) {
			System.out.println("It is night.");
		}
		else {
			System.out.println("Please enter a valid value");
		}
	}
}
