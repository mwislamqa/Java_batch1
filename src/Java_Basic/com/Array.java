package Java_Basic.com;

public class Array {

	public static void main(String[] args) {
		
		
		String name="md islam";
		//type1
		String fname = name.substring(0, name.indexOf(" "));
		String lname = name.substring(name.indexOf(" ") + 1);
		String converName1 = lname +" "+fname;
		

		System.out.println(converName1);
		//type2
			String fName=	name.substring(0,2);
			String lName=name.substring(name.length()-5);
			String converName = lName +" "+fName;
			System.out.println(converName);
		//array decleration 1 | |||||||
		int []a= new int[5];
		a[0]=7;
		a[1]=6;
		a[2]=1;
		a[3]=4;
		a[4]=5;
		System.out.println(a[4]);
		for (int i=0;i<=5;i++) {
			System.out.println("hello");
		//	print("hello");
			
		//	int a=20;
		}
		
		//=======================================
		//2
		String str[]= {"honda","toyta","nissan"};
		//int str[]= {100};
		//String st1="honda";
		//String st2="toyta";
		
		
			int aa=str.length-1;
			
		
		System.out.println(aa);
/*
		for(String s:str){
			//System.out.println(s);
			System.out.println(str[0]);
			
			  if (s!="bmw" ) 
				
			  { System.out.println("test pass"); }
			  
			  else { System.out.println("test fail"); }
			  continue;
	*/		  
			//  System.out.println(s);
			 
			 
		// array value cannot print without loop
		}
		
	}


