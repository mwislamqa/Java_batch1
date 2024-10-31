package Java_Basic.com;

public class ArrayDD {

	public static void main(String[] args) {
		int calender1[][] = new int[1][2];
		calender1[0][0] = 1;
		int calender[][] = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < calender.length; i++) {

			for (int j = 0; j < calender.length; j++) {
				System.out.print(" " + calender[i][j]);
			}
		System.out.println();
		}

	}

}
