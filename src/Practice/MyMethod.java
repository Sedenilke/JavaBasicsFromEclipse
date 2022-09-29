package Practice;

public class MyMethod {

	static void Method() {
		System.out.println("Hello There!");
	}
	
	static void firstName(String fName) {
		System.out.println(fName + " Pekiner");
	}
	
	static void nameAge(String name, int age) {
		System.out.println("Your name is " + name + " and your age is " + age);
	}
	
	static int myAge (int age) {
		return age + 10;
	}

	public static void main(String[] args) {
		Method();
		Method();
		Method();
		firstName("Ilke");
		firstName("Seden");
		System.out.println(myAge(12));
		nameAge ("Ilke", 42);

	}

}
