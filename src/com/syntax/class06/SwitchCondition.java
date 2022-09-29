package com.syntax.class06;

public class SwitchCondition {

	public static void main(String[] args) {
		/*
		 * Switch statement is a great alternative for if+else if Advantages: ---it is
		 * faster when you compare it with if else if debugda gorduk ki if else'de java
		 * tum adimlari tek tek dolasiyor dogru bolumu bulmak icin ama switchte direkt
		 * ilgili yere atliyor, tum uymayan caseleri atlayip. ---it looks cleaner
		 * switch works with byte, short, int, char and String
		 * if and if else is condition based, switch is value base
		 */

		String nameOfTheDay = "Invalid Day";
		int day = 2;

		switch (day) {
		case 1:
			nameOfTheDay = "Monday";
			break; // if we do not have a break, code day 2'den sonraki tum degerleri tek tek alacak son degere kadar
		case 2:
			nameOfTheDay = "Tuesday";
			break;
		case 3:
			nameOfTheDay = "Wednesday";
			break;
		case 4:
			nameOfTheDay = "Thursday";
			break;
		case 5:
			nameOfTheDay = "Friday";
			break;
		case 6:
			nameOfTheDay = "Saturday";
			break;
		case 7:
			nameOfTheDay = "Sunday";
			break;
		default: //you can place default anyplace in the switch as long as you use break at the end, on the other side, else block should be at the end always
			System.out.println("Please enter a number between 1 and 7 including these numbers");
			break;
		}
		System.out.println("Today is " + nameOfTheDay);
	}

}
