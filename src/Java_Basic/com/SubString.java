package Java_Basic.com;

public class SubString {

	public static void main(String[] args) {
		String st= "md islam";
		//md print
		System.out.println(st.substring(0,2 ));
		//islam note last index always one more 
		System.out.println(st.substring(3,8));
		//d i
		System.out.println(st.substring(1,4));
		System.out.println(st.substring(0, 2)+st.substring(4,5));
		
		System.out.println("--------------------------------");
		//index for character of string
		
		String str= "ab cd af ka";
		
		int index =0;
		char ch= 'a';
		for(int i=0; i <str.length();i++) {
			
			if(str.charAt(i)==ch)
			{
				System.out.println(i+" ");
				index++;
			}
			
		}
		System.out.println("count of a from string-   "+index);
		System.out.println("---------------");
		String name ="abc def kal abc";
		String substring ="abc";
		int count =0;
		int abcIndex =name.indexOf(substring);
		
		while(abcIndex !=-1) {
			System.out.println("abc index number:  "+abcIndex);
		
			count++;
			abcIndex=	name.indexOf(substring, abcIndex +1);
		}
		System.out.println("abc count:-"+count);
		
		int a=100;
		double b=a;
		System.out.println(b);
	}

}
