package com.syntax.class04;

import java.util.Scanner; //it brings all the methods from that class

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("Please type your age: ");
		
		Scanner newObj = new Scanner(System.in);
		int age = newObj.nextInt();
		
		if(age > 18) {
			System.out.println("You should study!");
		}
		else {
			System.out.println("You should start working");
		}

	}

}
