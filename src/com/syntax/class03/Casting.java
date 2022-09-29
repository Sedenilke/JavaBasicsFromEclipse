package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		
		/*
		 *  Type casting --> type = data type casting = converting
		 *  What is type casting?
		 *  Answer: Converting one data type to another data type.
		 *  Why should I learn about data type casting?
		 *  Answer: so that we can use the code that is written by someone else to make our life easier.
		 *  or when we will be working in teams we will be able to merge the code.
		 *  What is the syntax for type casting?
		 *  Answer: when we are converting something smaller to larger, we do not need to do anything.
		 *  
		 *  It happens automatically we just assign the variable for example:
		 *  int box = 1234;
		 *  long box2 = box; --> this is how it works and it is called implicit or widening automatic
		 *  
		 *  However, when we convert a larger data type to smaller data type this is how we do it.
		 *  long box = 1245454;
		 *  int box2 = (int) box;  --> narrowing or explicit or manual conversion 
		*/
		
		byte box1 = 127; // smallest box: 8 bits
		short box2 = 3333;  // slightly large box, double the size of box1 in terms of bits: 16 bits
		int box3 = 454545; // large box most commonly used, double the size of box2 in terms of bits: 32 bits
		long box4 = 454545454; //slightly large box, double the size of box3 in terms of bits: 64 bits
		float box5 = 41456454.8888888f; // larger box
		double box6 = 41414145.123124123123123131; //largest box
		 /*daha buyuk bir degeri daha kucuk bir kutuya sokmaya calisiyorum. 
		  * java bu konuda beni uyariyor. emin misin? ben eminim diyorum ve sonuclarina katlaniyorum.
		  */
		
		byte smallerBox = (byte) box2; // bunun sonucu short type of 3333 --> byte will be 5 bunun hesaplamasi binary number ile oluyor.
		System.out.println(smallerBox);
		
		short biggerBox = box1; //kucuk bir degeri daha buyuk bir kutuya koymak istiyorum. Burada hic sorunum yok:
		System.out.println(biggerBox);
		
		long box7 = box1;
		System.out.println(box7);
		
		
		//float box8 = box6; box6 is type of double and box8 is float type of data, here I try to fit something bigger to a smaller box//
		float box8 = (float) box6;
		System.out.println(box8);
		
		char a = (char) 66; 
		/* here we assign letter a the value what it shows number 66 in ASCII table which is B
		 * if we write 65, it will show letter A,
		 * if we write 63, it will show ?
		 */
		System.out.println(a);
		
				
	}

}
