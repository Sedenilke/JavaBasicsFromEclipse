package com.syntax.class04;

import java.util.Scanner;

public class Day4HwPart5 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Which city do you live? ");
		String inputCity = obj.nextLine();

		System.out.println("What is the temperature(F) right now in your city?");

		double inputTemperatureInFah = obj.nextDouble();
		double TemperatureInCel = ((5 * (inputTemperatureInFah - 32.0)) / 9.0);

		System.out.println("In " + inputCity + " it is " + TemperatureInCel + " celsius degree right now.");

	}

}
