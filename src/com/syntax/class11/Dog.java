package com.syntax.class11;

public class Dog { //it is like blueprint

	// state of an object -- what do they have, how do they look like
	// attributes/ properties/ fields
	String name;
	String color;
	String breed;
	double weight;
	int age;

	// behavior --> What does a dog do? Methods = Functions = Behaviors bunlarin hepsi ayni seyler. Examples:
	 void bark() {
		System.out.println("Barking....");
	}

	void sleep() {
		System.out.println("Sleeping....");
	}

	void run() {
		System.out.println("Running....");
	}

	void eat() {
		System.out.println("Eating....");

	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog(); // we create an object from the class Dog
		//new Dog() --> this part creates an object of class Dog
		//Dog dog1 = --> part only the assignment
		dog1.bark(); // we call a method/ behavior on an object?
		dog1.run();
		
	}
}
