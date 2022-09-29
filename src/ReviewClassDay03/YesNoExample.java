package ReviewClassDay03;

import java.util.Scanner;

public class YesNoExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Are you from batch14?");
			String batch14 = scanner.next();
			if(batch14.equalsIgnoreCase("Yes")) {
				System.out.println("You are amazing");
			}
			else {
				System.out.println("You are good");
		}

	}

}
