package com.syntax.class11;

public class Person {
String name;
int age;
double weight, height;
boolean isFunny;

void study() {
	if(name.equals("Anna")) {
		System.out.println("I will study.");
	}
	else if (name.equals("Roman")) {
		System.out.println("I will keep on deleting the messages and will not let any one study.");
	}
	else {
		System.out.println("I try to study but things do not make much sense.");
	}
}

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "Anna";
		person1.study(); // Anna icin yazdigim karsiligi gorecegim.
		
		person2.name = "Adam";
		person2.study();
	}

}
