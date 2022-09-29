package com.syntax.class10;

public class ArrayOfCountry {

	public static void main(String[] args) {
		// First array is North America
		String[][] countries = { { "USA", "Canada" }, // 1st Array with index 0 (North America)
				{ "Peru", "Brazil", "Colombia", "Ecuador" }, // 2nd Array with index 1
				{ "Ethiopia", "Egypt", "Kenya" }, // 3rd Array with index 2, Africa
				{ "Germany", "Moldova", "Turkiye", "Ukraine" }, // Europe 4th Array with index 3
				{ "Kazakhstan", "Afghanistan", "Korea" }, // Asia, 5th Array with index 4
		};

		System.out.println(countries.length); // 5, it shows how many elements inside the 2D array, we can image it as 5
												// single array,or 5 rows.
		int elementsOfFirstArray = countries[0].length;
		System.out.println(elementsOfFirstArray); // 2, first row has 2 elements
		int elementsOfSecondArray = countries[1].length;
		int elementsOfThirdArray = countries[2].length;
		int elementsOfFourthArray = countries[3].length;
		int elementsOfFifthArray = countries[4].length;

		System.out.println("Elements of First Array: " + elementsOfFirstArray);
		System.out.println("Elements of Second Array: " + elementsOfSecondArray);
		System.out.println("Elements of Third Array: " + elementsOfThirdArray);
		System.out.println("Elements of Fourth Array: " + elementsOfFourthArray);
		System.out.println("Elements of Fifth Array: " + elementsOfFifthArray);

		System.out.println("-------Getting all values from 2D array -------");
		for (int row = 0; row < countries.length; row++) { // counts the rows
			for (int column = 0; column < countries[row].length; column++) // counts of columns
			{
				System.out.print(countries[row][column] + " ");
			}
			System.out.println("");
		}

		System.out.println("------------Using enhanced loop--------------");

		for (String[] theCountries : countries) {
			for (String eachCountry : theCountries) {
				if (eachCountry.equals("Turkiye")) {
					System.out.println(eachCountry + " is my home country.");
				} else {
					System.out.print(eachCountry + " ");

				}
				System.out.println("");

			}
		}
		
		System.out.println("---------------------------");
		
		for (int i = 0; i < countries[1].length; i++) { // counts the rows
				System.out.print(countries[1][i] + " ");
			}
			System.out.println("");
		}
		
	}
