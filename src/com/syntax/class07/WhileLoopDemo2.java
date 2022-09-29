package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print all numbers from 1 to 10
		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println("-----------------");

		// print all numbers from 10 to 25
		int num1 = 10;
		while (num1 <= 25) {
			System.out.print(num1 + " ");
			num1++;
		}
		System.out.println("-----------------");
		// print all numbers from 10 to 1
		int num2 = 10;
		while (num2 >= 1) {
			System.out.print(num2 + " ");
			num2--;
		}
		System.out.println("-----------------");

		// print all numbers 50 to 20
		int x = 50;
		while (x >= 20) {
			System.out.print(x + " ");
			x--;
		}
		System.out.println("-----------------");

		// print all even numbers from 1 to 20
		int y = 2;
		while (y <= 20) {
			System.out.print(y + " ");
			y = y + 2;
		}
		System.out.println("-----------------");

		System.out.println("Another way:");
		int b = 1;
		while (b <= 20) {
			if (b % 2 == 0)
				System.out.print(b + " ");
			b++;
		}
		System.out.println("-----------------");

		// below example is an infinite loop with no output:
		/*
		 * int b=1; while (b<=20) { if(b%2==0) { System.out.print(b + " "); b++; } }
		 */
//below code only works for one time, than 
		int c = 2;
		while (c <= 20) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
				c++;
			}
		}
		
		
	
	}

}
