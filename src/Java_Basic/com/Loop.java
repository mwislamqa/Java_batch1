package Java_Basic.com;

public class Loop {

	public static void main(String[] args) {

		// String name="md islam";

		for (int a = 0; a < 10; a++) {

		}
		String[] st = { "honda", "car", "cycle", "boat", "lanch" };

		for (String str : st) {
			System.out.println("for each loop:::::"+str);

		}
		for (int k = 0; k < 1; k++)

		{

			if (st[k].contains("bike")) {
				System.out.println("test pass");
				// break;
			}

			else {
				System.out.println("fail");
				// break;
			}

		}
		// loop 3 type
		// for loop
		// while
		// do
		// ------------------
		// for loop== value 1 2 3 4 5 6
		// index 0 1 2 3 4 5

		/*
		 * for(initialization; condition ; increment/decrement) { statement(s); }
		 */
		// decrement
		for (int i = 6; i >= 0; i--) {
			System.out.println(i);

		}
		System.out.println("=======================");

		// increment0,1,2
		for (int x = 0; x < 3; x++) {
			x++;
			System.out.println(x);

		}
	}
}
