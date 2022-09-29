package Practice;

public class ToFindHowManyTimesALetterPassInAWord {

	public static void main(String[] args) {
		 String message = "xyxxxzaxxxxxx";
	        int index = message.indexOf("x");
	        int total = 0;
	        while(index >=0){
	            message = message.substring(index+1);
	            index = message.indexOf("x");
	         total = total + 1;
	        }
	         System.out.println(total);

	}

}
