package Practice;

public class LoopRemoveSpecialChar {

	public static void main(String[] args) {
		 String message = "Ix lovex youxxx";
	        int index = 0;
	        index = message.indexOf("x");
	        while(index>=0) {
	        	message = message.substring(0, index) + message.substring(index+1);
	       System.out.println(message);
	       index = message.indexOf("x");
	        }
	       
	       }
	    }
	

	


