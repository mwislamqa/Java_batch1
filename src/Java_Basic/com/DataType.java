package Java_Basic.com;

public class DataType {

	public static void main(String[] args) {
		Constructor obj = new Constructor(20);
		//primitive data type in java
				byte b=1;
				short s=20;
				int i= 20;
				long l=30l;
				float f=50.5f;
				double d=20.0d;
				boolean bo=true;
				char c='c';
				
				//non primitive data
				String str=" ";
				int array[]= {};
				//interface;
				
				//wrapper class which is help to convert one data type to another
				//string to int
				String st="200";
			int in=	Integer.parseInt(st);
			System.out.println("integer value:::::"+(in+20));
			//String to double
			double dd=Double.parseDouble(st);
			System.out.println(dd);
			//int to double 
			Double.valueOf(dd);
			double dk= Double.valueOf(i);
			System.out.println(dk);
			//int to string
			String str1=String.valueOf(i);
			System.out.println(str1+10);
			//double to stirng
			String sd=String.valueOf(d);
			System.out.println("sd value"+(sd+10.5));
			//data type varibaleName= value.
			int a;
			double dddd= 20d;
			int dint =200;
			System.out.println("reverser"+Integer.reverse(dint));
		    int fint= (int) f;
			//-----------------wedding custing--------------------
			//byte -> short -> char -> int -> long -> float -> double
			byte by=3;
			int bvalue=by;
			System.out.println(bvalue);
			int wint=10;
			double wdu=wint;
			System.out.println(wdu);
			int cChar=4;
			float fChar=cChar;
			System.out.println(fChar);
			float fLoat=210.4f;
			double dOubel=fLoat;
			System.out.println(dOubel);
			
			//type casting 
			//Integer.valueOf(fLoat);
			double ddf=fLoat;
			//float data.
			//float fdd=dddd;
	//		Float.parseFloat(fLoat);
			int fconv=(int)fLoat;
			System.out.println("float to int::::"+fconv);
			
				
	}

}
