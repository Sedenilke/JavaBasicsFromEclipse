package ReviewClassDay04;

public class Recap {

	public static void main(String[] args) {
		// for (first term; second term; third term)
		// Java statement, a boolean: true/false; java statement
		// when we start the loop java executes the first term:
		// "System.out.println("Starting point)"
		// and it only executes ONCE!
		// then it checks the condition, which is second term in for below example it is
		// TRUE,
		// then it executes the actual code:System.out.println("2");
		// then it implements the third term: System.out.println("3")
		for (System.out.println("1"); true; System.out.println("3")) {
			System.out.println("2");
		}

		// yukaridaki endless loop bundan sonra bir code yazarsam asagidaki gibi,
		// asla ona ulasamayacak ve hata verecek:
		// for(int i=0; i<=10; i++) {
		// System.out.println(i + " ");
	}
	// for(System.out.println("Starting point"); true; System.out.println("Ending
	// point"));
	// {
	// System.out.println(i + " ");
	// }

}
