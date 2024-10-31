package Java_Basic.com;

public class Loopp {

	public static void main(String[] args) {
		
		
		//for loop
		for (int i = 0; i < 10; i++) {

			System.out.println("for loop");

		}
		System.out.println("========while===========");
		
		//while loop.if condition is false then not execute
		int num=1, sum=0;
		while (num>10)
		{
			sum=sum+num;
			System.out.println("while loop");
			num++;
		}
		System.out.println(sum);
		System.out.println("========do===========");
		
		
		//do loop, if condition is false then exectue only one time.
		int l=0;
		do {
			
			//body
			System.out.println("do loop");
			l++;
		}while(l>10);
	}
//0123456789=45
}
