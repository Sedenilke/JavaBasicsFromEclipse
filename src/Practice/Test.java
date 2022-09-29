package Practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
 /* Write a Java program that accepts three integers from the user and return 
  * true if two or more of them (integers )have the same rightmost digit. The integers are non-negative.*/
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Please type 3 numbers: ");
		int input1 = obj.nextInt();
		int input2 = obj.nextInt();
		int input3 = obj.nextInt();
	
		if(input1%10 == input2%10 || input1%10==input3%10 || input2%10 == input3%10) {
			System.out.println(true);
			}
		else {
			System.out.println(false);
		}
	 
		}
	}



