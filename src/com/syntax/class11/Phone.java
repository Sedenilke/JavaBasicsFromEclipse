package com.syntax.class11;

public class Phone {

	// attributes/ properties/ fields
	String make, model, color;
	int storage;
	double size;
	boolean cheap;

	void call() {
		System.out.println("Calling .....");
	}

	void takePicture() {
		System.out.println("Taking pictures.");
	}

	public static void main(String[] args) {
		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 14 Pro Max";
		iphone.color = "Purple";
		iphone.storage = 128;
		iphone.size = 6.8;
		iphone.cheap = false;

		System.out.println("I am planning to buy a " + iphone.color + " " + iphone.model + " " + iphone.storage);
		iphone.call();
		iphone.takePicture();

		System.out.println("*************************");

		Phone samsungPhone = new Phone();
		samsungPhone.make = "Samsung";
		samsungPhone.model = "S22 Ultra";
		samsungPhone.color = "Grey";
		samsungPhone.storage = 256;
		samsungPhone.cheap = false;

		// "make" belongs to class, it is an template, objectlerle birlesince anlam
		// kazaniyor.
		System.out.println(iphone.make);
		System.out.println(samsungPhone.make);
	}

}
