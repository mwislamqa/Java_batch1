package Java_Basic.com;

public class LoopInsideLoop {

	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * for (int j = 0; j < 10; j++) { System.out.print("loop  "); }
		 * //System.out.println("loopinside"); System.out.print("\n");
		 * 
		 * }
		 */
		int cal[][]= new int[2][2];
		cal[0][0]=1;
		cal[0][1]=2;
		
		cal[1][0]=1;
		cal[1][1]=2;
		
		
		for(int k=0; k<cal.length;k++)
		{
			for(int j=0; j<cal[0].length;j++) {
				System.out.print(" "+cal[k][j]);
			}
			System.out.println();
		}
		
		
	/*	String s[][]= new String [3][3];
        s[0][0]="a";
		s[0][1]="b";
		s[0][2]="c";
	
	
		s[1][0]="a";
		s[1][1]="b";
		s[1][2]="c";
	
	  s[2][0]="a";
	  s[2][1]="b";
	  s[2][2]="c";
	  for(int row=0;row<s.length;row++) {
			for(int column=0;column<s[0].length;column++) {
				System.out.print("  "+s[row][column]);
			}
			System.out.println();
		}
		
	*/
	}

}
