package Java_Basic.com;

public class chatGTP {
	
	public static void main(String[] args) {
		String star="*";
		String star1="";
		//System.out.println(star);
		for(int i=0;i<=10; i++) {
			for(int j=0; j<=i; j++)
			{
				System.out.print(star);
			}
			System.out.println();
		}
		
		int num =123456;
		int rever=0;
		
		while(num !=0) {
		int reminder=	num%10;
		rever =rever*10 +reminder;
		num/=10;
		}
		System.out.println(rever);
		
	
	 int number = 12345;
     int reversedNumber = reverseNumber(number);
     System.out.println("Original number: " + number);
     System.out.println("Reversed number: " + reversedNumber);
 }

 public static int reverseNumber(int number) {
     // Convert the number to a string
     String numberStr = Integer.toString(number);

     // Reverse the string
     String reversedStr = new StringBuilder(numberStr).reverse().toString();

     // Convert the reversed string back to an integer
     int reversedNumber = Integer.parseInt(reversedStr);

     return reversedNumber;
 }
}
