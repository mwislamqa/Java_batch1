package Java_Basic.com;

public class Java_Operator {
	
	
	//operator in java
			//arithmetic ----> + -/ * %
			//relational operator (comparision)---> == < > <= => !=
			//logical opertor-----> && || !
			//incremental/decremental operator-----> ++ --
			//assigment operator------> =
	
	//arithmetic ----> + -/ * %
//syntax :veriable(container)= data type anyName= value.
	public static void main(String[] args) {
	int a= 20;
	int b=40;
	int sum= a+b;
	System.out.println(sum);
	//syso+ ctrl-space
	System.out.println("----------------------------");
	int sum1=(b-a);
	System.out.println(sum1);
	
	System.out.println("----------------------------");
	int div=b/a;
	//1.5
	System.out.println("dir value:"+div);
	System.out.println("----------------------------");
	int mut=a*b;
	System.out.println(mut);
	
	int mud=b%a;
	System.out.println(mud);
	
	
	//relational operator (comparision)---> == < > <= => !=
	//== a b same 
	//<> greater and lesser 
	//<= lesser equal
	//=>equal greater 
	//!= not equal
	System.out.println(a==b);//false
	System.out.println(a>b);//false
	System.out.println(a<b);//true
	System.out.println(a<=b);//true
	System.out.println(a>=b);//false
	System.out.println(a!=b);//true
	System.out.println("---------------------------------------------");
	//logical opertor-----> && || !
	//&& and
	// || or
	// ! not
	boolean x=true;
	boolean y=true;
	 System.out.println(x && y);//false bcox tow condition is not ture
	 System.out.println(x || y);//true bcoz one condition is ture
	 System.out.println(!x);// ! not ture but x ture given false
	 System.out.println(!y);// y not ture result given true
	
	//incremental/decremental operator-----> ++ --
	 int k=10;
	
	k=k+1;// increment
	 k--;//decrement
	 int p=20;
	
	
	 System.out.println(k);
 }
}	
