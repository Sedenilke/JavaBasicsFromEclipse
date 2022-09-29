package com.syntax.class07;

public class ShortandOperators {

	public static void main(String[] args) {
		int i =10;
		i = i + 9;
		System.out.println(i); //19
		
		i = i-5;
		System.out.println(i); //14
		
		i = i*5;
		System.out.println(i); //70
		
		int a=10;
		a+=9; /*it does the same thing a = a +9; this is only the shortest way to show it. As a result of this op.
		*Here "a" will be 19;
		*/
		System.out.println(a);
		a-=5; // Here value of "a" is 19 and we subtract 5 from it than value of "a" is 14 now. 
		a*=10 ; //140
		a-=10; //130
		a%=4; //2
	}

}
