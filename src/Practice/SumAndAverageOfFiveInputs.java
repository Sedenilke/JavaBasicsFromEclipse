package Practice;

import java.util.Scanner;

public class SumAndAverageOfFiveInputs {
	public static void main(String[] args) {
	
	Scanner myObj1 = new Scanner(System.in);
	Scanner myObj2 = new Scanner(System.in);
	Scanner myObj3 = new Scanner(System.in);
	Scanner myObj4 = new Scanner(System.in);
	Scanner myObj5 = new Scanner(System.in);
	double num1, num2, num3, num4, num5, sum, average;
	
	System.out.println("Please type your first number: ");
	num1 = myObj1.nextDouble();
	
	System.out.println("Please type your second number: ");
	num2 = myObj2.nextDouble();
	
	System.out.println("Please type your third number: ");
	num3 = myObj3.nextDouble();
	
	System.out.println("Please type your forth number: ");
	num4 = myObj4.nextDouble();
	
	System.out.println("Please type your fifth number: ");
	num5 = myObj5.nextDouble();
	
	
	sum = num1 + num2 + num3 + num4 + num5;
	average = sum/5;
	System.out.println("The sum of these five numbers is: " + sum);
	System.out.println("The average of these five numbers is: " + average);
	}
}
