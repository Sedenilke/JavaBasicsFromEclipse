package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// 	matching cases must of same data types a variable
		//	no duplicated cases in switch -if you write case 'Y' 
		/*LIMITATIONS WITH SWITCH: 
		 * you cannot write something like case 'Y' || 'y': 
		*  to cover that you need to write them separately.
		*  You cannot use any relational operational with switch. you cannot use ">", "<" etc.
		*  CAN NOT work with boolean values.-it gives compiler error (CE)
		*  CAN NOT work with float/double and long values.
		*/
		char choice = 'Y';
		String answer;
		switch (choice) {
		case 'Y':
			answer = "Yes";
			break;
		/*case 'Y':
			answer = "Yeah!" // no dublicated cases in switch -if you write case 'Y' 
			break;
			*/
		case 'N':
			answer = "No";
			break;
		case 'M':
			answer = "Maybe";
			break;
		default:
			answer = "Unknown";
			break;

		}
		System.out.println(answer);
	}

}
