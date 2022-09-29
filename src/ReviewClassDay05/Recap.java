package ReviewClassDay05;

import java.util.Arrays;

public class Recap {

	public static void main(String[] args) {
		double size = 10;
		int[] arr = new int [10];
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = 20 + i;
		}
System.out.println(Arrays.toString(arr));
	}

}
