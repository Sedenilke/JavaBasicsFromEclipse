package com.syntax.class11;

public class Student {
	
	//attributes/ properties/ fields
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	//behavior --> What does a dog do? Methods = Functions = Behaviors bunlarin hepsi ayni seyler. Examples:
	void study() {
		System.out.println("Student is studying");
	}
	void goToSchool () {
		System.out.println("Student go to school");
	}
	void deleteMessages() {
		System.out.println("Deleting message from Discord");
	}
	
	void eat() {
		System.out.println("Eating pizza!");
	}
	
	public static void main(String[] args) {
		Student student1 = new Student() ;
		student1.name = "Seden";
		student1.age = 12;
		student1.id = "123456";
		System.out.println("The name of the student is " + student1.name + " and the students id is " + student1.id );
		student1.goToSchool();
		student1.deleteMessages();
		
		System.out.println("---------------------");
		System.out.println();
		
		Student student2 = new Student();
		student2.name = "Mary";
		student2.age =16;
		student2.weight = 30; 
		student2.gender ='F';
		System.out.println("The age of the student " + student2.age);
		student2.eat();
	}

}
