package Practice;
import java.util.Scanner;

public class GreatestNumberAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		Scanner myObj3 = new Scanner(System.in);
				
		int firstNum, secondNum, thirdNum;
		
		System.out.println("Please type your first number: ");
		firstNum = myObj1.nextInt();
		System.out.println("Please type your second number: ");
		secondNum = myObj2.nextInt();
		System.out.println("Please type your last number: ");
		thirdNum = myObj3.nextInt();
		
		if(firstNum == secondNum || firstNum==thirdNum || secondNum==thirdNum) {
			System.out.println("Please type different numbers.");
		}
		else {
		
		if(firstNum > secondNum) {
			if (firstNum > thirdNum) {
			System.out.println("Largest number among these numbers is the first one: " + firstNum);
		}
		    else {
		    	System.out.println("Largest number among these numbe\\rs is the third one: " + thirdNum);
		    }
				
		}
		else if (secondNum > firstNum) {
			if (secondNum > thirdNum) {
				System.out.println("Largest number among these numbers is the second one: " + secondNum);
			}
			else {
				System.out.println("Largest number among these numbers is the third one: " + thirdNum);
				
			}
		}
		else if(thirdNum>firstNum) {
			if (thirdNum > secondNum) {
				System.out.println("Largest number among these numbers is the third one: " + thirdNum);
			}
			else {
				System.out.println("Largest number among these numbers is the second one: " + secondNum);
			}
			
		}
		}
		}
		

}
