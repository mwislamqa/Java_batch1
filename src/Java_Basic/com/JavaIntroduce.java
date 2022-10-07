package Java_Basic.com;

public class JavaIntroduce {
	
	
	// webpage dom--> document object model Ui, HTML,
	// selenium locator ----HTML elements , find and 
	
	void Test() {
		//constuctor
		System.out.println("constuctor");
	
	}
	
	
	
	// instance area-global 
	 int k=30;// instance veriable 
	 
	 static int cat=20;
  /*
	1.	Variable data type 
	2.	Method
	3.	Constuctor 
	4.	Static block
	5.	Instance block

	*/
	// data type veriable = value
	//static area
	public static void main(String[] args) {
		JavaIntroduce t= new JavaIntroduce();
	
		JavaIntroduce.cal();
		t.m1();
		t.Test();
		
		int a=20;
		//int a=30;
		int b=10;
		int c=a+b;
		System.out.println("c value:  "+c);
		System.out.println("cat value:  " +cat);
	}
	
	//method
	//access modifer return type method_name (){}
	public static void cal() {
		System.out.println("static method");
		//int p=20;//local veriable 
	}
	void m1() {
		System.out.println("default modifer");
	}
	

	

}
