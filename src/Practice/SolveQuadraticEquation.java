package Practice;

import java.util.Scanner;
import java.lang.Math;

public class SolveQuadraticEquation {
	//Write a Java program to solve quadratic equations
	
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		Scanner myObj3 = new Scanner(System.in);
		
		System.out.println("Please type your x^2 coefficient which is a: ");
		double a = myObj1.nextDouble();
		System.out.println("Please type your x coefficient which is b: ");
		double b = myObj2.nextDouble();
		System.out.println("Please type your constant term c: ");
		double c = myObj2.nextDouble();
		double discriminant = b*b-4*a*c;
		double root1 = (-b + Math.sqrt(discriminant))/2*a;
		double root2 = (-b - Math.sqrt(discriminant))/2*a;
		double sameroot = -b/2*a;
	
		if(discriminant < 0) {
			System.out.println("There is no real root.");
		}
		else if (discriminant == 0){
			System.out.println("Both of the roots are the same and they are: " + sameroot);
				
		}
		else {
			System.out.println("Your equation has two different roots and they are: " + "root1: " + root1 + " root2: " + root2);	
		}
	}

}
