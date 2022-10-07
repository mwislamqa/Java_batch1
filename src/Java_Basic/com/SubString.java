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
		System.out.println(st.substring(0, 2)+st.subSequence(4,5));
	}

}
