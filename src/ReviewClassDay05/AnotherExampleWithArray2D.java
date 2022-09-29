package ReviewClassDay05;

import java.util.Arrays;

public class AnotherExampleWithArray2D {

	public static void main(String[] args) {
		
		int [][] arr = new int[][] 
				{
			{10, 20, 30},
			{25, 25, 63}
				};
				
				System.out.println(Arrays.toString(arr[1])); // 
				System.out.println((arr[0][2])); //Arrays.toString does not work with individual element burada direkt elemani cagiriyoruz.

	}

}
