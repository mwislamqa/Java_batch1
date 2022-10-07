package Java_Basic.com;

public class Constructor {

	public static void main(String[] args) {
		//what is constructor
		//class name and method name should me same
		//constructor executed while class object is create 
		Constructor obj = new Constructor(2);
		//Constructor obj1 = new Constructor(3);
		//Constructor obj2 = new Constructor(2,4);
		String s1="Md";
		String s2="Md";
		System.out.println(s1+""+"/"+""+s2);
	System.out.println(String.join("/", s1,s2));
		System.out.println(s2);
		System.out.println(s2.trim());
		if(s1.matches(s2)){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	
	}
	
	public Constructor() {
		System.out.println("constructor create by arif");
	}
	
	Constructor(int a) {
		
		this();
		System.out.println(a);
	}
	Constructor(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}

}
