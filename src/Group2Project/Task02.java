package Group2Project;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// NEEDS TO WORK
		// Using Scanner create an array of countries.
		// When an array is created, retrieve all values from it and while retrieving
		// those values print capital for each country. (use 2 different loops).

		Scanner input = new Scanner(System.in);

		String[][] countryWithCapital = { { "TURKEY", "Ankara" }, { "USA", "Washington, D.C." }, { "SPAIN", "Barcelona" },
				{ "FRANCE", "Paris" }, { "GERMANY", "Berlin" }, { "NETHERLANDS", "Amsterdam" }, { "AUSTRAI", "Vienna" },
				{ "CANADA", "Ottawa" }, { "EGYPT", "Cairo" }, { "INDIA", "Delhi" }, { "ITALY", "Rome" },
				{ "MOLDOVA", "Chisinau" }, { "PAKISTAN", "Islamabad" }, { "POLAND", "Warsaw" },
				{ "SWEDEN", "Stockholm" } };

		System.out.println("How many countries do you want to store?");
		int numberOfElements = input.nextInt();
		String[] countryArray = new String[numberOfElements];

		for (int i = 0; i <= numberOfElements - 1; i++) {
			// if it is the last country:
			if (i == numberOfElements - 1) {
				System.out.println("Please enter your last country: ");
				countryArray[i] = input.next();
				// for all other entries:
			} else {
				System.out.println("Please enter a country: ");
				countryArray[i] = input.next();
			}
		}

		for (int r = 0; r < countryWithCapital.length; r++) {
			for (int i = 0; i < countryArray.length; i++) {
				if (countryWithCapital[r][0].equalsIgnoreCase(countryArray[i])) {
					System.out.println("For country " + countryWithCapital[r][0] + " the capital city is "
							+ countryWithCapital[r][1]);
				}
			}
		}
		System.out.println("----------------------");
		System.out.println(
				" ****** If you don't see the full list of countries with their capitals, it is not your fault. It means, we need to expend our list.******");
	}
}
