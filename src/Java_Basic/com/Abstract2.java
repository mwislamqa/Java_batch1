package Java_Basic.com;

public class Abstract2 extends Abastract1{
	int  a=2;
	public void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		
		Abastract1 ab= new Abstract2();
		ab.display();
		ab.m1();
		
	}

	@Override
	void m1() {
		System.out.println("override method md islam");
		
	}

}
