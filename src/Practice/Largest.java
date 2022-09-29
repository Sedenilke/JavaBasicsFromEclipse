package Practice;

public class Largest {
//field:
	private int [] array1;
	int sum = 0;
	
//constructor:
	public Largest(int [] theArray1) {
		array1 = theArray1;
	}
//method:
	public int getLargest() {
		int largest = array1[0];
		for(int elements: array1) {
			if(elements>largest) {
				largest =elements;
			}
		}
		return largest;
	}
	
//method2
	public double getAverage() {
		
		for(int elements: array1) {
			
			sum = sum + elements;
	}
		 double average = (sum)/array1.length; 
		 return average;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] myArray = {31, 43,54,56,76,89,99};
Largest array11 = new Largest (myArray);
System.out.println(array11.getLargest());
System.out.println(array11.getAverage());
	}

}
