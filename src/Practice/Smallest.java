package Practice;

public class Smallest {
	//field:
	private int [] numberArray;
	//constructor:
	public Smallest(int [] theNumberArray) {
		numberArray = theNumberArray;
	}

	public int getSmallest() {
		int theSmallest = numberArray[0];
		for(int initial: numberArray) {
			if(initial< theSmallest) {
				theSmallest =initial;
			}
		} return theSmallest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] myArray = {12,45,98,67,23};
		
		Smallest smallest1 = new Smallest(myArray);
		System.out.println(smallest1.getSmallest());
	}

}
