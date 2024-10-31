package Java_Basic.com;

public class InterfaceExecution implements Interface1,Interface2{

	InterfaceExecution(){
	System.out.println("contractor");	
	}
	
	public static void main(String[] args) {
		
		Interface1 in= new InterfaceExecution();
		in.chrome();
		in.m1();
		//in.display1();
		
		InterfaceExecution ab= new InterfaceExecution();
		
		System.out.println(ab.a);
		
		int ser=ab.a;
		System.out.println(ser);
		//ab.display1();
		
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

	@Override
	public void chrome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ff() {
		// TODO Auto-generated method stub
		
	}

}
