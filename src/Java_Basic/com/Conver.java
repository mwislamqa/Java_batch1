package Java_Basic.com;

public class Conver {
static int a=20;
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println(Conver.a);
		String st="wel come";
		
		System.out.println(st);
		String strf=st.substring(0,3);
		String strl=st.substring(4);
		String expected= strl+" "+strf;
		System.out.println(expected);
	System.out.println(st.substring(0,4)+"wal"+st.substring(3));
	
	//indexOf return int/char
	 String name="mdwislam";
	 String lname= name.substring(0, name.indexOf("w"));
	 String fname=name.substring(name.indexOf("w")+1);
	 System.out.println(fname+lname);
	 
	  String lnd="london value";
	  System.out.println(lnd.substring(7));
	 System.out.println(lnd.substring(0, 2)+lnd.substring(7, 8)+lnd.substring(11, 12));
	
	 int a= 12345;
		int rverse=0;
		while(a!=0) {
			
		int reminder = a%10;// reminder =4
		rverse = rverse*10+reminder;// 0*10+4= rverse=4
		a=a/10;//54/10=5
			
			
		}
		System.out.println(rverse);
		
		//temp/third veriabla swapping string
	String st1="md";
	String st2="islam";
	String temp;
	temp=st1;// md value
	st1=st2; //k contain islam
	st2=temp;//p contian temp value(md)
	System.out.println(st1 +""+st2);
	
	//without third variable
	st1=st1+st2;//concatinate k and p value =mdislam
	//strat o index then st1 length mdislam -st2 lenght islam=md
	st2=st1.substring(0, st1.length()-st2.length());
	//store st2 value islam inot st1 islam
	st1=st1.substring(st2.length());
	
	System.out.println(st1 +""+st2);
	//System.out.println(p.substring(6)+k.substring(0, 3));
	//swap int
	int x=20;
	int y=30;
/*	int z=0;
	z=x;
	x=y;//30
	y=z;//20
	*/
	
	x=x+y;//20+30=50
	y=x-y;//50-30=20
	x=x-y;//50-20=30
	
	
	System.out.println(x );
	System.out.println(y);
	
	
	
	
	
	}

}
