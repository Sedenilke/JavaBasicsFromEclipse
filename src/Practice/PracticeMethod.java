package Practice;

public class PracticeMethod {

	static void myMethod1() {
		System.out.println("Hello There!");
	}
	static String myMethod2(String firstName) {
		return "Dear " + firstName;
	}
	
	static void myMethod3(String firstName, int age) {
		System.out.println("Your first name is " + firstName + " and your age is " + age);
	}
	
	
	static int myTotal(int x, int y) {
		return x + y;
	}
	static double myTotal(double x, double y) {
		return x + y;	
	}
	public static void main(String [] args) {
		myMethod1();
		System.out.println(myMethod2("Seden"));
		myMethod3("Seden", 45);
		int total = myTotal(3,6);
		double total2 = myTotal(12.5, 12.5);
		System.out.println(total + " versus " + total2);
		
	}
}

