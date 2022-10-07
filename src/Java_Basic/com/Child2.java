package Java_Basic.com;

public class Child2 extends Child1{

	public static void main(String[] args) {
		Parant pt= new Parant();
		//dynamic way obj creation
		Parant p= new Child1();
		p.run();
		p = new Child2();
		p.run();
		Child1 ch=new Child1();
		//Child1 ch=new Parant();
		ch.run();
		ch.notifyAll();

	}
	
	public void run() {
		System.out.println("child2");
		
	}

}
