package com.syntax.class11;

public class Employee {
	
	//field
	String name, id, department, shift; 
	double salary;
	
	//behaviors
	void work() {
		//asagida methodun icinde ozellik kullandim. bu yeni bir sey!
		
		System.out.println(name +" is working on shift " + shift);
	}
	
	void takeLeaves() {
		System.out.println(name + " is going to leaves.");
	}
	

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee2.name = "Mary";
		employee2.shift = "morning";
		
		employee1.name = "John";
		employee1.id = "123";
		employee1.department = "IT";
		employee1.salary = 200000;
		employee1.shift = "evening";
		
		employee1.work();
		employee2.work();
		
		
	}

}
