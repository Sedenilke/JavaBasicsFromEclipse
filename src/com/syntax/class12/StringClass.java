package com.syntax.class12;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// proper way to create a String object
		String str = new String("Java");
		// below code does the same thing. Java developers realize we heavily use String
		// so they make it
		// easy way to declare and initiliza like we do with primitive data types int,
		// double etc.
		//
		System.out.println("Length method: ");
		String name = "Java";
		String testName = "here is your name";
		System.out.println(str.length()); // 4
		System.out.println(name.length()); // 4

		// In real life we use them to check the length of the password or username.

		if (testName.length() > 15) {
			System.out.println("Name can not be more than 15 characters.");
		}

		System.out.println();
		System.out.println("-----------------");
		// UpperCase method. It converts all the letters in the word to Uppercase

		System.out.println("UpperCase method: ");
		String name1 = "dna";
		System.out.println(name1.toUpperCase());
		// LowerCase method. It converts all the letters in the word to Lowercase
		System.out.println("LowerCase method: ");
		String name2 = "JAVA";
		System.out.println(name2.toLowerCase());

		System.out.println();
		System.out.println("-----------------");

		// concat method:
		System.out.println("Concat method: ");
		String firstName = "Olena";
		String lastName = "Dudka";

		System.out.println(firstName + " " + lastName); // Mostly this is used
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName.concat(" ").concat(lastName)); // if I want to add a space
		System.out.println(firstName.concat(" " + lastName)); // another way to add a space.

		System.out.println();
		System.out.println("-----------------");

		// empty and blank methods:
		// empty returns true if a String is empty this method will return false even if
		// you have a space in a String variable however
		// the isBlank method does not count the spaces.
		System.out.println("Empty and Blank methods: ");
		String testName1 = " ";
		String testName2 = "Ilke";
		System.out.println(testName1.isEmpty()); // it is not empty. It has blank character. so it will turn false.
		// System.out.println(testName2.isBlank()); // is Blank does not include my
		// version of Java, but newer versions have it.

		System.out.println();
		System.out.println("-----------------");
		System.out.println("Trim method: ");
		String name3 = "            I love Java               ";
		// Remove the spaces before and after the String but the ones which are present
		// in between.
		// basindaki ve sonundaki bosluklari siliyor ama kelimeler arasindaki bosluklara
		// dokunmuyor.
		System.out.println(name3.trim());

		System.out.println();
		System.out.println("-----------------");

		System.out.println("startsWith, endsWith and contains methods: ");
		// startsWith method
		String name4 = "Java is very easy";
		System.out.println(name4.startsWith("J")); // is there any word starting with letter "J" it turns a boolena
													// value.
		System.out.println(name4.endsWith("J")); // is there any word ends with letter letter "J". Since Java is case
													// sensitive "j" and "J" are different
		System.out.println(name4.contains("very")); // checks if a string contains a specific letter or word
		// asagida once cumledeki her seyi lowercase'e ceviriyoruz sonra da "java"
		// kelimesini aratiyoruz. kucuk harfle. original
		// cumlede Java yazmis olsa bile burada kod "java" kelimesini buluyor ve true
		// donuyor.
		System.out.println(name4.toLowerCase().contains("java"));

		System.out.println();
		System.out.println("-----------------");

		// equals checks if two Strings are exactly the same
		// equalsIgnoreCase checks if two Strings are exactly the same but does not care
		// about the case of the letters. Java, JaVA, JAVA are all the same.
		System.out.println("equalsIgnoreCase method: ");
		String name5 = "Shah";
		if (name5.equals("Shah")) {
			System.out.println("I found it.");
		}
		if (name5.equalsIgnoreCase("SHAH")) {
			System.out.println("I found it with equalsIgnoreCase");
		}

		System.out.println();
		System.out.println("-----------------");
		System.out.println("CharAt method: ");
		// charAt returns us the character at a specific index
		String name6 = "I love java programming";
		for (int i = 0; i < name6.length(); i++) {
			if (!(name6.charAt(i) == ' ')) { // aradaki bosluklari da siliyor.
				System.out.print(name6.charAt(i)); // We get all the letters one by one
			}
			
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Convert a string's elements to an array elements: ");
		// toCharArray will convert a String to an array of chars
			char[] charArray = name6.toCharArray();
			System.out.println(charArray[5]);
			System.out.println(Arrays.toString(charArray));
			System.out.println();
			System.out.println("-----------------");
			System.out.println("To find how many specific letter passes in a given String: ");
			int counter =0;
			for(char c: charArray) {
				if(c=='a') {
					counter++;
				}
			}
			System.out.println(counter); //letter "a" passes 3 times in charArray elements 
			
			
			System.out.println();
			System.out.println("-----------------");
			System.out.println("Index method: ");
			//index her zaman ilk karsilastigi indexin numarasini veriyor.
			String name7= "I am always confused whenI was a kid.";
			System.out.println(name7.indexOf("I")); //0 
			System.out.println(name7.indexOf("a")); //2
			System.out.println(name7.indexOf(" ")); //1
			
			System.out.println();
			System.out.println("-----------------");
			System.out.println("Substring method: ");
			//Substring always gives you smaller string from a string we can start the starting part
			//to this method and it will return us the substring from that index.
			//starting point is inclusive, ending part is not. 
			System.out.println(name7.substring(4)); // always confused whenI was a kid. It includes the number it start from index 4.
			System.out.println(name7.substring(5,10)); // alway it starts with index 5 element and stops at index 9
			
			System.out.println();
			System.out.println("-----------------");
			
			System.out.println("Replace method: ");
			String name8 = "Batch 14 is good";
			String name9 = "Batch 14 asdasdasdadasd890820931!sdadada";
			System.out.println(name8.replace("good", "excellent")); //but it makes this chance only temporary. tekrar name8'i print out etmek istersem originalindeki gibi yazacak
			System.out.println(name8);
			System.out.println(name9.replaceAll("[a-z]", " ")); //bu kod Stringdeki tum kucuk harfleri siliyor ve geri kalanini yaziyor.
			System.out.println(name9.replaceAll("[a,d]", " ")); // if I write it with comma, it removes all the letters "a" and "d" in the String	
		}
	}
