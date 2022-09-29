package com.syntax.class12;

//this is the Phone Class and its fields and functions
public class Phone {
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
	
	//fields/attributes
	String make, model, color;
	int year, storage;
	
	//behaviors/methods/functions
	
	void  makeCall() {
		System.out.println("Making a call using " + model);
	}
	
	void takePictures() {
		System.out.println("Taking picture with " + model); 
	}
	
	void browseInternet() {
		System.out.println("Browsing the internet using " + model);
	}

}
