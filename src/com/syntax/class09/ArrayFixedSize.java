package com.syntax.class09;

public class ArrayFixedSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if you do not store anything in any of those boxes, they take the default values based on the data type
		// if array is int its default value is "0"
		//if array is String, its default value is "null"
		int[] nums = new int[3];
		nums[1]=12;
		nums[2]=13;
		
		System.out.println(nums[0]); // it gives 0, because even though I did not assign any value for container 0, its default value is 0
		/* Onemli:
		 * Compile error olursa exlipse goruyoruz. kodun yaninda kirmizi yaniyor. ama run-time error olursa bunu compileda gormuyoruz
		 * ancak kodu run etmeye badladigimizda bu hatayi aliyoruz. 
		 * buna ornek eger array 4 elemandan olusuyor ve index 5'teki elemani cagirmaya calisirsam compileda hicbir yanlis gormuyorum.
		 * ama kodu calistirmaya basladigimda run-time error hatasi aliyorum.
		 */
		
		
		//asagidaki kodda 
		String[] colors = new String[3];
		colors[0] = "White";
		colors[1] = "Pink";
		colors[2] = "Black";
		//colors[3] = "Yellow"; ArrayIndexOutOfBoundsException: 3 
		
		//shorter way to declare and initialize the array:
		String[] drinks = {"fanta", "milk", " juice", "lemonade"};
		System.out.println(drinks[2]);
		
		//how many elements inside my array?
		int size = drinks.length; // will give # of elements in the array
		System.out.println("Size of array " + size); 
	}

}
