package com.syntax.class02;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int a = 900;
		int b = 100;
	
		
		System.out.print("Sum of a and b: ");
		System.out.println(a+b);
		System.out.print("Sub of a and b: ");
		System.out.println(a-b);
		System.out.print("Multiplication of a and b: ");
		System.out.println(a*b);
		System.out.print("Division of a and b: ");
		System.out.println(a/b);
		System.out.println("----------------------");

		int c = 10;
		int d = 3;
		int sum = c + d;
		int sub = c-d;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println("----------------------");
		
		int e = 10;
		int f = 5;
		System.out.println("Division of e by f: " + e/f); //2
		System.out.println("Remainder when you divide e by f: " + e%f);  //0 -> e'yi f'e bolersem kalan kac olur?
		
		int remainder =	c%d;
		System.out.println("Remainder when I divide 10 by 3: " + remainder);
		int div = c/d;
		System.out.println("Division when I divide 10 by 3 when 10 and 3 are chosen as integer: " + div); 
		// bunun sonucu 3,3333333 ama biz data type'i int olarak sectigimiz icin sonucu da int. olarak gosteriyor.
	
		
		double num1 = 10.0;
		double num2 = 3.0;
		System.out.println("When I define num1 and num2 as double, it gives the exact answer after the division: " + num1/num2); // burada sonucu decimal olarak veriyor.		
		System.out.println("Here: " + num2/num1);
		System.out.println("Here: " + num1/num2);
		System.out.println("----------------------");
		float num3 = 10.0f;
		float num4 = 3.0f;
		System.out.println("When I define num3 and num4 as float, it gives the exact answer after the division: " + num1/num2);
		
		
	}

}
