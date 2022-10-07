package Java_Basic.com;

public class Abbs extends Abstract2{
	int a=20;
	
	Abbs(int a, String name){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		Abstract2 a= new Abstract2();
		a.m1();
		a.m2();
	}

}
