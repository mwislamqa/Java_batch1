package Java_Basic.com;

public class Child2 extends Child1 {

	/// overloading compile time poly 
	
	public void star() {
		int a=2;
		int b=10;
       int c=a+b;
 System.out.println(c);
	}

///run time .
	public static void main(String[] args) {
		
		/*
		 * try{ int data=100/0; }catch(ArithmeticException e){System.out.println(e);}
		 * System.out.println("rest of the code...");
		 */
		int data=100/0;
	System.out.println(data);
		Parant pt = new Parant();
		// pt.run();

		Child1 ch1 = new Child1();
		//ch1.run();

		Child2 ch2 = new Child2();
		//int value =ch2.star();
		
				// ch2.run();
		Parant p = new Child2();
		p.run();

		// dynamic way obj creation
		/*
		 * Parant p= new Child1(); p.run();
		 * 
		 * Child2 child2 = new Child2(); child2.run(); child2.runner();
		 * 
		 * p.run(); Child1 ch=new Child1(); //Child1 ch=new Parant(); ch.run();
		 * ch.runner();
		 */
	}

	public void run() {
		super.run();
		System.out.println("child2");

	}

}
