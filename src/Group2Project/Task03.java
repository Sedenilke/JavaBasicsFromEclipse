package Group2Project;

public class Task03 {
//DONE
	public static void main(String[] args) {
		//DONE
		// Create a 2D array of integer values. Print the sum of all numbers.
		int sum = 0;
		int[][] number = {
                {15,82,63,49},
                {45,96,78,15,23,67,41},
                {17,25,67,96,30},
        };
		
		for (int[] rowsum : number) {
			for (int columnsum : rowsum) {
				sum = sum + columnsum;
			}
		}
		System.out.println("Here is the sum of the elements in your integer array: " + sum);
	}
}
