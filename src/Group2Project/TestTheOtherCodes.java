package Group2Project;

public class TestTheOtherCodes {

	public static void main(String[] args) {
		int[] numbers = {380, 234567, 123456, 1237658, 56179, 435679, 7433};

        int max = numbers[0];
        int secondLargest = 0;
        int count =0;

        
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                secondLargest = max;
                max = numbers[i];
                break;
            }
   
        		if (max < numbers[i]) {
        			max = numbers[i];
        		}
        		if(secondLargest<numbers[i] && secondLargest != max) {
        			secondLargest = numbers[i];
        		}
        	}
        		
        System.out.println("The max value of the array is " + max);
        System.out.println();
        System.out.println("The second largest value of the array is " + secondLargest);
    }

}
	
