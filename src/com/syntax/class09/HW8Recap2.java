package com.syntax.class09;

public class HW8Recap2 {

	public static void main(String[] args) {

	        for (int h = 0; h < 24; h++) {

	            for (int m1 = 0; m1 <= 5; m1++) {

	                for (int m2 = 0; m2 <= 9; m2++) {

	                    if (h < 10) {
	                        System.out.println("0" + h + ":" + m1 + m2);
	                    } else {
	          // asagida dakikalari toplamiyor: m1 +m2 , cunku h'den sonra string geliyor ":" bu da bundan sonraki int'leri string olarak algiliyor
	                    	System.out.println(h + ":" + m1 + m2); 
	                    }
	                   
	                    	    int number = 2020;
	                    	   for (int i=2011;i<number;i++) {
	                    	        System.out.println("Hey,it is year:");
	                    	     System.out.println(i);
	                    	  }
	                    	 }
	                    	 }
	                }
	            }
	        
	    }

