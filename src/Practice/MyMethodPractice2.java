package Practice;

public class MyMethodPractice2 {
	String firstName= " ilke";
	String lastName = " Pekiner";
	int age = 23;

	static void myMethod() {
		System.out.println("How are you today?");
	}

	static void myMethod2(int age) {
		System.out.println("You age is " + age);
	}

	static void myMethod3(int age) {
		if (age >= 21) {
			System.out.println("You are allowed to drink");
		} else {
			System.out.println("You are not allowed to drink");
		}
	}

	static int myMethod4(int x) {
		return x + 9;
	}
	static int myMethod5(int x , int y) {
		return x + y;
	}

	static void myMethod6(String name, String phone) {
		System.out.println("Your name is " + name + " and your phone number is " + phone);
		
	}
	
	static void myMethod7() {
		MyMethodPractice2 myObj = new MyMethodPractice2();
		System.out.println(myObj.firstName);
		System.out.println(myObj.lastName);
		System.out.println(myObj.age);
	}
	

	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// method a block of code that runs when it is called
		
		
		myMethod();
		myMethod2(5);
		myMethod3(21);
		System.out.println(myMethod4(9));
		System.out.println(myMethod5(3, 5));
		myMethod6("Seden" , "868-56-78");
		myMethod7();
	}

}
