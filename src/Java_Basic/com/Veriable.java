package Java_Basic.com;

import java.sql.Driver;

public class Veriable {
	
	static int k=20;//static veriable
	int p=10;// instance veriable
	int a;
	

	//constructor
	Veriable(int a , String b) {
		
	}
	
	public static void main(String[] args) {
		
		//constructor
		
		new Veriable(1, "md");//default constructor
		
		int t=22;//local veriable.
		
		//System.out.println(v.a);
		//System.out.println(v.p);
		/*System.out.println(t);
		System.out.println(k);
		int vvv=v.add(2);
		System.out.println(vvv);*/
		//System.out.println(p);not able to call direct 

	}
	
	public void  edit(String a) {
		
	}
	
	public int add(int a) {
		
		int a1=30;
		//a=3.33
		
		Boolean b=false;
		this.a=a;
		return a;
	}

}
