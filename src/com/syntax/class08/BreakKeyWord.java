package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {
			System.out.println("Hello");
			break; // break the block of code. Here loop executes one time and than stops. We
					// mostly use it inside an if
		}
		System.out.println("--------------End--------------");

		for (int j = 1; j < 5; j++) {
			System.out.println("Hello");
			if (j == 3) {
				break; // break the block of code. Here loop executes one time and than stops. We
						// mostly use it inside an if
			}
		}
		System.out.println("--------------End--------------");
	}

}
