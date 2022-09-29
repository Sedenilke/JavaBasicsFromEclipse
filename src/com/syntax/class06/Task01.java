package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */
		double quiz, midTerm, finalScore;
		Scanner obj = new Scanner(System.in);

		System.out.println("Please enter your quiz:");
		quiz = obj.nextDouble();
		System.out.println("Please enter your midterm:");
		midTerm = obj.nextDouble();
		System.out.println("Please enter your final:");
		finalScore = obj.nextDouble();
		char grade = '0';
		
		double average = (quiz + midTerm + finalScore) / 3;
		
		if(average >=90) {
			grade='A';
		}
		else if(average>=70 && average<90) {
			grade = 'B';
		}
		else if(average>=50 && average<70) {
			grade = 'C';
		}
		else if (average<50 && average>=0) {
			grade ='D';
		}
		else {
			System.out.println("Please enter valid values");
		}
		System.out.println("Your grade is " + grade);
	}

}
