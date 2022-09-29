package ReviewClassDay01;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Your cell phone rings. Return true if you should answer it. 
		Normally you answer, except in the morning you only answer if it is your mom calling. 
		In all cases, if you are asleep, you do not answer.*/
	
		boolean isAsleep, isMorning, isMom;
		isAsleep = false;
		isMorning = true;
		isMom = true;
		
		
		
	if(isAsleep) System.out.println("Uyuyorum cevaplayamam");
	else if (isMorning) {
		if(isMom) System.out.println("Sabah ama annem ariyor ac");
		System.out.println("Sabah ve annem aramiyor dolayisyla acmiyorum.");
	}
	System.out.println("Sabah degil ve uyumuyorum dolayisiyla cevaplayabilirim");	
		}
		
	}


