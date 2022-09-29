package com.syntax.class13;

import java.util.Arrays;

public class Recap {

	public static void main(String[] args) {
		String str = "Today is Sunday";
		String day= str.substring(9);
		System.out.println(day);
		char c = str.charAt(5); //calling the method charAt on str object
		//methodun basinda "void" varsa bunu yukaridaki gibi baska bir variablea atayamiyorum.
		//cunku void buna engel oluyor. Javaya ben store edilecek bir sey donmeyecegim diyor.
		System.out.println();
		
		char [] charArr = str.toCharArray(); // I am not passing anything 
		//System.out.println(Arrays.toString(charArr));
		
		int index = str.indexOf("a");
		System.out.println(index);
		System.out.println(str.indexOf("a", 6)); // burada index 6'dan sonraki kisimda gecen ilk "a" harfinin indexini donuyor.
        System.out.println("-----------------");
        
        //asagidaki kisim "o" harflerinin gectigi indexleri yaziyor.
		String name1 = "Thor love and thunder";
		for(int i=0; i< name1.length(); i++) {
			if (name1.charAt(i)=='o') {
				System.out.println(i);
			}
		}
		 System.out.println("-----------------");
		 //asagidaki kisimda ayni isi goruyor ama ExampleMethod Classinda olusturdugum methodu kullanarak bu durumu yazdiriyorum
		 
		 ExampleMethod newObj = new ExampleMethod();
		 newObj.printAllIndexes(name1, 'o');
		 
		 String name2= "stersdfaadsKAFAFAFADFASDAKL11492%$&*";
		 System.out.println(name2.replaceAll("[0-9]", "@"));
		 System.out.println(name2.replaceAll("[0-9]", ""));
		 System.out.println(name2.replaceAll("[sf]", ""));
		// burada 0 to z are matching with ASCII table. 
		 //Bu kod tablodaki 0 dan z'ye kadar olan herseyi siliyor.
		 // we call it regular expression.
		 // here is the website that we can use for that: regexr.com
			
		 System.out.println(name2.replaceAll("[0-z]", "")); 
		 //Remove all the letters from a to z refer the asci table for range info.
		 System.out.println(name2.replaceAll("[a-z]", "")); 
		 //Remove all the from A to Z refer the asci table for range.
		 System.out.println(name2.replaceAll("[A-Z]", "")); 
		 System.out.println(name2.replaceAll("[^A-Z]", ""));  // ^ sembol makes to delete everything in the string except the uppercase characters.
		 System.out.println(name2.replaceAll("[^a-z]", "")); //remove everything but lowercase letter a to z.
		 System.out.println(name2.replaceAll("[^a-zA-Z]", "")); //don't remove upper&lowercase letter but all other characters.
		 System.out.println(name2.replaceAll("[^a-zA-Z0-9]", "")); //don't remove uppercase, lowercase and numbers, but remove everything else
	}

}
