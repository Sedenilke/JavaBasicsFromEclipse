package com.syntax.class04;
import java.util.Scanner;
public class Day4HwPart7 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		System.out.println("How many years have you been working?");
		double workYear = obj.nextDouble();
		System.out.println("What is your annual salary?");
		double annualSalary = obj.nextDouble();
		
		if(workYear >=5) {
			System.out.println("Congratulations! You are eligible for the bonus.");
			if(annualSalary >50000) {
				System.out.println("You will receive $5000 bonus.");
			}
			else {
				System.out.println("You will receive $3000 bonus.");
			}
		}
		else {
			System.out.println("Sorry, you are not eligible for the bonus this year.");
			
		}
	}

}
