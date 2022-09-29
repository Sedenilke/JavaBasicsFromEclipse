package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		
		String firstName ="Mina";
		String lastName = "Henen";
		String fullName = firstName+ " " + lastName;
		System.out.println(fullName);
		
		int houseNo =10;
		int apartmentNo = 5;
		String streetName = "That street";
		String city = "New York";
		String country = "USA";
		String fullAddress= apartmentNo + houseNo +streetName + city + country; //bunu cikartmak istersek code apartmentNo ile houseNo'yu toplayacak ve 15 verecek!!!
		System.out.println(fullAddress);
		
		fullAddress= apartmentNo + " " + houseNo +" " +streetName +" "+ city + " " + country;
		System.out.println(fullAddress);	
		
		/*burada program hata veriyor cunku 10 ile 5'i integer olarak tanimlamadik ve
		 * string + number also is a String, dolayisiyla ben burada 10 'u cikarmaya calisiyorum.
		 */
		
		//System.out.println("if you subtract 10 from 5 we get = " + 10 - 5); 
		/* asagida daha acik ornegi*/
		
		String step1 = "if you subtract 10 from 5 we get = " + 10;
		//String step2 = step1 - 5;
		/*result a String it is not defined java does not understand  
		 * what to do when we ask her to subtract a String from a number it complains
		String step2 = step1-5; 
		 */
		
		 System.out.println("If we subtract 10 from 5 we get = " + (10 - 5));
		

	}

}
