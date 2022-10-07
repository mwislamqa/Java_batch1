package Java_Basic.com;

public class InterfaceExecution implements Interface1,Interface2{

	InterfaceExecution(){
	System.out.println("contractor");	
	}
	
	public static void main(String[] args) {
		
		InterfaceExecution ab= new InterfaceExecution();
		System.out.println(ab.a);
		
		int ser=ab.a;
		System.out.println(ser);
		ab.display1();
		
		Interface1.display();
		ab.m1();
		

	}

	
	public void m1() {
		m2();
		System.out.println("prajdklfdjl");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

}
