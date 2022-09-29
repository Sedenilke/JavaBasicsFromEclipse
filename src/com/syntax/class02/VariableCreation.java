package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First way to create a variable
		byte b = 10;

		//Second way to create a variable
		
		int i; // create a variable
		i = 100; //assign the value
		//we need to create a variable only once
		//then we can use it as many times we want/need 
		
		
		//Third way to create a variable
		//create a variable is the same as declare a variable, I ask a space for a variable
		int num1, num2, num3;
		num1 = 100; // assign the value or initialize the variable
		num2 = 200;  // assign the value
		num3 = 300;
		System.out.println(num2); //200
		
		//int num1 = 100; error -->duplicate variable
		
		// ? Can I change a value of a variable??
		
		num2 = 2000; // reassign the value
		System.out.println(num2); //2000
		
		//Task 1:
		byte myByte = -12;
		System.out.println(myByte);
		myByte = -21;
		System.out.println(myByte);
		
		short myShort = 12345;
		System.out.println(myShort);
		myShort = 4321;
		System.out.println(myShort);
		
		int myInt = 1096578;
		System.out.println(myInt);
		myInt = 8756901;
		System.out.println(myInt);
		
		long myLong = 1234567890l;
		System.out.println(myLong);
		myLong = 987654321l;
		System.out.println(myLong);
		
		boolean day = true, night = false;
		System.out.println(day);
		System.out.println(night);
		day = false;
		night = true;
		System.out.println(day);
		System.out.println(night);
		
		char myUnitNumber = 'D';
		System.out.println(myUnitNumber);
		myUnitNumber = 'A';
		System.out.println(myUnitNumber);
		
		float myFloat = 1234.9678804f;
		System.out.println(myFloat);
		myFloat = 234.9678f;
		System.out.println(myFloat);
		
		double myDouble = 1234.967880486954;
		System.out.println(myDouble);

		
		/*rules for identifiers = names (variables, methods, class etc.)
		Rule 1: I cannot use keywords of Java(String, continue, for, while, etc) as identifiers 
		String break = "you are on break"; --> error. "break" is allocated by Java. we cannot use it
		Rule 2: cannot have space in identifiers
		String last name = "Smith"; --> error
		Rule 3: identifiers cannot start with numbers
		int 1number = 123; --> error
		int number1 = 123; is ok, number can come after alpha characters
		Rule 4: identifiers cannot contain any special characters except "$" and "_"
		boolean hello! = true; you cannot use "hello!" as variable.
		double $price = 9.99; --> it is ok to use.
		float _price = 1.99f; --> it is ok to use.
		
		/* NAMING CONVENTIONS:
		 * Class start with Uppercase and follow with camel cases "HelloWorld" Not "helloworld" 
		 * bu bir must degil ama genel boyle kullaniyor. eclipse'de "helloworld" adinda bir class
		 * yaratmaya calistigimda ust kisimda bir uyari veriyor. Bu onerilmez diye.
		 * 
		 * variables and methods should start with the lowercase. "myWheather" not "MyWheather" 

		 */
		
		
	}

}
