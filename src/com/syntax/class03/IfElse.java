package com.syntax.class03;

public class IfElse {

	public static void main(String[] args) {

		// Example 1: A simple example how if condition works, it works only the
		// statement inside the parentheses is TRUE
		if (true)
			System.out.println("1.if block");
		else
			System.out.println("1.Else block");

		// Example 2: Can I afford to buy a burger?
		double money = 5;
		double kfcBurger = 11;

		if (money > kfcBurger) {
			System.out.println("2.Yay I can enjoy the burger");
		} else {
			System.out.println("2. I should make something at home");

		}

		// Example 3: about my bank balance is enough for transfer:
		double myBankBalance = 2000;
		double theAmountThatIWantToTransfer = 250;
		if (myBankBalance > theAmountThatIWantToTransfer)
			System.out.println("3. Funds transfered successfully");
		else
			System.out.println("3. Please try again not enough balance");

		// Example 4: Whether I am hungry
		boolean isHungry = true;
		if (isHungry) {
			System.out.println("4. I need to eat something");
		} else {
			System.out.println("4. I can wait till dinner time");
		}

		// Example 5:
		int savings = 1000000;
		if (savings > 10000) {
			System.out.println("5. I am rich");
			System.out.println("I can go vacations");
			System.out.println("I can buy a Tesla");
		} else {
			System.out.println("5. I need to save more");

		}

		// Example 6:
		int mySaving = 65000;
		if (mySaving >= 65000) {
			System.out.println("6. I can buy a Tesla");
		} else {
			System.out.println("6. I need to save more");
		}

		// Example 7:
		if (mySaving == 60000) {
			System.out.println("7. I can buy a Tesla");
		} else {
			System.out.println("7. I need to save more");
		}

		// Example 8:
		int num3 = 19;
		if (num3 != 19) {
			System.out.println("8. This number is not 19");
		} else {
			System.out.println("8. This number is 19");
		}

		// Example 9: Which day we are
		int day = 1;
		if (day == 1) {
			System.out.println("9. Today is Monday");
		} else if (day == 2) {
			System.out.println("9. Today is Tuesday");
		} else if (day == 3) {
			System.out.println("9. Today is Wednesday");
		} else if (day == 4) {
			System.out.println("9. Today is Thursday");
		} else if (day == 5) {
			System.out.println("9. Today is Friday");
		} else if (day == 6) {
			System.out.println("9. Today is Saturday");
		} else if (day == 7) {
			System.out.println("9. Today is Sunday");
		}
		else {
			System.out.println("9. Please enter a number between 1 and 7 including these numbers");
		}
		
		//String ile nasil yapariz.
		
		String name = "Asma";
		if(name.equals("Wahid")) {
			System.out.println("10. I love Mondays");
		}
			else {
				System.out.println("10. I love Weekends");
			}
		}
	}
