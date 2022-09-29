package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		// for loop syntax 
		//for(initialization; condition; increment/decrement) {
		//Block of Code
		//}
		// When we know in advance how many times to repeat block of code--> USE FOR LOOP
		//When we don't know in advance how many times to repeat block of code --> USE WHILE OR DO WHILE
//I want to say Hello 5 times:
		
		for(int i=1; i<=5; i++ ) {
			System.out.println("Hello!");
		}
		System.out.println("-------------------");
		//print numbers from 1 to 20
		for(int j=1; j<=20; j++ ) {
			System.out.print(j + " ");
		}
		System.out.println("-------------------");
		
		//print numbers from 30 to 10
		for(int k=30; k>=10; k-- ) {
			System.out.print(k + " ");
		}
		System.out.println("-------------------");
		
		//what is the output? Answer: all even numbers between 0 and 10
		for(int m= 0; m<=10; m+=2) {
			System.out.print(m + " ");
		}
		System.out.println("-------------------");
		
		//wHAT IS THE OUTPUT?
		for(int f =10; f<=25; f+=5) {
			System.out.print(f + " ");
		}
		System.out.println("-------------------");
		
		int sum=0;
		for(int n=1; n<=6; n++) {
			sum+=n;
		}
		System.out.println(sum);
	}

}
