package com.syntax.class12;

public class PhoneTester {
//this is the main class to run phone class.
//if this main class is in the same package with the other class that we are calling the variables or methods, we do not import it.
//if it is not we need to import the class inside the main class.
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 14 Pro Max";
		iphone.year=2022;
		iphone.storage = 128;
		iphone.makeCall();
		
		// new Phone() is responsible to create the object
		//classes are also data types. "Phone samsungPhone" part 
		//I create a variable name samsungPhone in Phone data type.
		Phone samsungPhone = new Phone();
		
		samsungPhone.model = "S22 Ultra";
		samsungPhone.make = "Samsung";
		samsungPhone.year = 2022;
		samsungPhone.makeCall();

	}

}
