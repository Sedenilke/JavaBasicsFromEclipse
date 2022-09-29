package Practice;

public class StringMinusTheLastChar {

	public static void main(String[] args) {
		        String word ="ilke";
		        int lengthOfWord = word.length();
		        while (lengthOfWord>=0) {
		        	System.out.println(word.substring(0, lengthOfWord));
		        	  lengthOfWord--;
		        }
		       
		    }
		}

	

