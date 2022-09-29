package Practice;

public class Array {

	public static void main(String[] args) {
		
		    String[ ] arr = {"Hello", "Hey", "Good morning!"};
		    
		     String word = null;
		     for (int index = 0; index < arr.length; index++)
		     {
		       word = arr[index];

		       if (word.equals("Hey"))
		       {
		         System.out.println(index);
		       }
		       //else {
		    	  // System.out.println("-1");
		      // }
		     }
		     System.out.println("-1");
		   }
		 }

		

