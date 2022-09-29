package Group2Project;

public class Task08 {

	public static void main(String[] args) {
		//DONE
		// Write a Java Program to print the first 10 numbers of Fibonacci series. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
		int [] fibonacci = new int [10];
		fibonacci[0] = 0;
		fibonacci [1] = 1;
		
		for(int i = 2; i<fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
			}
	for (int elements: fibonacci) {
		System.out.print(elements + " ");
		}	
	}

}
