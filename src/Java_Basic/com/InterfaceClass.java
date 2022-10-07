package Java_Basic.com;

public class InterfaceClass {
	
	public static void main(String[] args) {
		String s= new String("md");
		System.out.println(s);
		 try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
	}
	/*
	 * Interface:
	In Java, an interface is an abstract 
	type that contains a collection 
	of methods and constant variables.
	It is one of the core concepts in Java 
	and is used to achieve abstraction, 
	polymorphism and multiple inheritances. 
	We can implement an interface in a Java class 
	by using the
	implements keyword.
	 */

	//===========
	/*
	 * Abstraction:
	  An abstract class is a class that is declared abstract
 	—it may or may not include abstract methods. 
	Abstract classes cannot be instantiated, but they can 
	be subclassed. When an abstract class is subclassed,
 	the subclass usually provides implementations for all
 	of the abstract methods in its parent class
	 */

}
