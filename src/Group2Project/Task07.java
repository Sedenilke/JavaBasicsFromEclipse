package Group2Project;

public class Task07 {

	public static void main(String[] args) {
		//DONE
		// Write a java program to check whether a given number is prime or not?

		int x = 234;
		int count = 0;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				System.out.println("Your number " + x + " is NOT A PRIME number.");
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Your number " + x + " is A PRIME NUMBER.");
		}
	}
}
