package Java_Basic.com;

public interface Interface1 {
	//by default final and static 
	int a=20;
	
	 abstract void m1();
	  void m2();
	  void m3();
	  public  static void display() {
		  System.out.println("static ");
	  };
	  public default void display1() {
		  System.out.println("default");
	  };

	

}
