package ReviewClassDay04;

public class ForLoop {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		for (int i = 0; i != 3; i++) {
			System.out.print(i + " ");
		}
		System.out.println("---------------------");

		for (int i=-1; i!= 3; i++) {
			System.out.print(i + " ");
		}
		System.out.println("---------------------");

		// 10 8 6 4 2 0
		for (int i = 10; i >= 0; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println("---------------------");

		// asagidaki bir infinite loop,starting point is greater than the condition
		// for(int i=10; i!=3; i++) {
		// System.out.println(i);
		// }

		// 9 5 1
		for (int i = 9; i >= 1; i -= 4) {
			System.out.print(i + " ");
		}
		System.out.println("---------------------");

		// 1 3 7 9
		for (int i = 1; i <= 9; i += 2) {
			if (i == 5) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println("---------------------");

		// asagidaki kod ayni ciktiyi veriyor ama continue kullanmak zorunda degilim
		// sadece if condition bunu cozuyor
		for (int i = 1; i <= 9; i += 2) {
			if (i != 5) {
				System.out.print(i + " ");
			}
		}
		System.out.println("---------------------");
	}
}
