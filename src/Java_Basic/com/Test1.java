package Java_Basic.com;

public class Test1 {
	
	static int a=0;

	public static void main(String[] args) {
		
		 String name= "md islam";
	        
	    //  String fname=  name.substring(0,name.indexOf(" "));
	    //  String lName = name.substring(name.indexOf(" ")+1);
		 String fname =name.substring(0,2);
		 String lName = name.substring(3, 8);
	      
	      
	     System.out.println(lName +" and "+ fname);
	        
		
		for(int i=0;i<10;i++) {
			a=a+100;
		}
		System.out.println(a);
	}

	private static int indexOf() {
		// TODO Auto-generated method stub
		return 0;
	}

}
