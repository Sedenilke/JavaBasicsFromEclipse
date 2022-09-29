package Practice;
import java.util.Scanner;
import java.lang.Math;

public class GetNumberDecideItIsPositive {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please type an integer: ");
		int userInput = myObj.nextInt();
		
		
		if (userInput > 0) {
			System.out.println("Your number is positive");
		}
		
		else if (userInput <0) {
			System.out.println("Your number is negative");
			}
		else {
			System.out.println("Your number is zero.");
		}
		}
	}

