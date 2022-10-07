package Java_Basic.com;

public class MethodLess1 {
	static int k=20;
	

	public static void main(String[] args) {
		
		System.out.println(MethodLess1.k);
		
		//call inside the main method
		 int a=20; 
	     a= 40;
		 a=60;
		System.out.println("aaaaaaaa value"+a);
		int b=30;
		int c= a+b;//login
		System.out.println(c);
		
	
		int d= a*b;//login
		System.out.println(d);
		int e=a/b;
		System.out.println(e);
		foodMard();
		foodMard();
		foodMard();
		print(2000);
		print(500);
		print(900);
		display(10, 20);
		//direct call
		display(102, 30);
		//by class name
		MethodLess1.display(11,22);
		sum(2);
		int sumAdd=sum(2);
		int sumAdd1=sum(30);
		int sumAdd2=sum(45);
		int kkkk=sumAdd+sumAdd1;
	System.out.println(kkkk);
		
		System.out.println(sumAdd);
		//class object create
		MethodLess1 obj= new MethodLess1();
		// call by class object crate
		obj.bus();
		obj.car();
		
		
	}
	
	//any variable any method name if more than one word than must be camel case
	
	//method-1
	public static  void foodMard() {
		
		
		int a=20; 
		int b=30;
		int c= a+b;//logic
		System.out.println("method call  :"+c);
		
	}
	//method -2 method with parameter or method with signature/ single parameter. 
	public static void print(int a) {
	
		
		System.out.println(a);
	}
	//method -3 multiple parameters
	public static void display(int a, int b) {
		int 	c=a+b;
		System.out.println(c);
		
	}
	//retun type method 
	public static int sum(int a) {
		System.out.println(a);
		return a;
		
		
	}
	public void car() {
		
		System.out.println("car method");
		
	}
	
	public void bus() {
		System.out.println("bus method");
	}
	
	
	

}
