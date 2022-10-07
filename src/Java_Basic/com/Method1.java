package Java_Basic.com;
public class Method1 {
	int k;
	int j;
	//what is method is a block which contain logic or piece of code
	//access modifire-return type-methodName(){}
	public static void m1() {
		//System.out.println("method m1");
	}
	public static void m2() {
		m1();
		System.out.println("static method m2");
	}
	//return type method//parameterize method
	public int m3(int a) {
		return a;
	}

	public int m6(int t) {
		return t;
	}
	public void m5(int a, int b) {
		this.k=a;
		this.j=b;
		System.out.println("method5"+(k+j));
	}

	public void m4(int a, int b) {
		System.out.println(a*b);
	}

	//Sting is Class.
	//logintest 
	public void loginMethod(String userName, String passod) {
		userName="msisl@gmaill.com";
		passod="2adfjd13@&&&   -"; 
		//  click login button. 
	}

	//=================main ====================
	public static void main(String[] args) {
		Method1 obj= new Method1();//object creation of this class.
		obj.m1();
		int m6=	obj.m6(3);
		obj.m5(2, 3);
		int m3Value=obj.m3(3);
		System.out.println(m3Value);
		m2();
		obj.m4(2, 4);
		//System.out.println(addmetod4);
		int sum=m6+m3Value;
		System.out.println("tow method sum::::"+sum);

	}
	//=============================static area==================
}
