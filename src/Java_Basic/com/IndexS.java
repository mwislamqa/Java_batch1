package Java_Basic.com;

public class IndexS {

	public static void main(String[] args) {
		int a=0;
		System.out.println(0/2);
		String name="welcome to usa";
		
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
			
			System.out.println(name.indexOf(7, 10));
			if(name.charAt(i)==2 && name.charAt(i)==8) {
				System.out.println("to"+i);	
				break;
			}
			
			
		}
				
		
	}

}
