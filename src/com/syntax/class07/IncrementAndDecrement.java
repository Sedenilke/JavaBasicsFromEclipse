package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 90;
		num = num+1;
		
		System.out.println(num);
		
		//another way to increment variable value by 1--> ++
		num++; // +1
		System.out.println(num);
		
		//to decrement a value of a variable by 1 --> --
		num--;
		System.out.println(num);
		
		int i =10;
		i--;
		i++;
		System.out.println(i); // nothing has changed here, because we decrease 1 then add 1 to this value that we receive the same value.
	}

}
