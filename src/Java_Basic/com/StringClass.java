package Java_Basic.com;

import java.util.jar.Attributes.Name;

public class StringClass {

	public static void main(String[] args) {
		
		String st1="londonwvalue";//love print
		System.out.println(st1.indexOf("l"));
	//System.out.println(st1.substring(0,7)+" to "+st1.substring(8));//index +1
	System.out.println(st1.substring(0, 2)+st1.substring(7, 8)+st1.substring(11, 12));
	String	lastIn=st1.substring(0, st1.indexOf("w"));
	String firstIn=st1.substring(st1.indexOf("w")+1);
	System.out.println(firstIn+"  "+lastIn);
	StringBuffer sb= new StringBuffer("md islam");
	System.out.println(sb.reverse());
	int num=12345;// can you revers it
	int reverse=0;
	while(num!=0){
	int	reminder=num%10;//
	reverse=reverse*10+reminder;
	num=num/10;
		
	}
	System.out.println(reverse);
	//swapping 
	int a=30;
	a=40;
	int num1=20;
	int num2=30;
	int tem=0;
	//tem=num1+num2;
	num1=num1+num2;//50
	num2=num1-num2;//20
	num1=num1-num2;//30
	System.out.println(num1);
	System.out.println(num2);
	
	
		
		//System.out.println(st1);
		//System.out.println(st1.trim());
		//System.out.println(st1.toLowerCase());
	//System.out.println(st1.replace("W", "w"));
	//System.out.println(st1.replace("Welcome", "go to"));
	//System.out.println(st1.isEmpty());
		/*
		 * String [] st=st1.split(","); for (String a:st) { System.out.println(a+"*");
		 * 
		 * }
		 */
	
		
		Object ohj= new Object();
		
		String name="Welcome home";
		System.out.println(name.isEmpty());
		System.out.print(name.toString());
		String name1="welcome";
		String con=name.concat(name1);
		System.out.println(con);
		//find index
		char ch=name.charAt(0);
		for(int i=0;i<name.length();i++) {
			if(i%2==0)
			{
				System.out.println("even index----"+name.charAt(i));
			}else {
				System.out.println("odd index----"+name.charAt(i));
			}
			
		}System.out.println("=====================");
		//System.out.println(ch);
		System.out.println(name.compareTo(name1));
			
		
		System.out.println(name.compareToIgnoreCase(name1));
		/*
		 * if(name.compareToIgnoreCase(name1)) {
		 * 
		 * };
		 */
		/*
		if(name.contains("Welcome")) {
			System.out.println("true");
		}else {System.out.println("false");};
		
		if(name.contentEquals("Welcome")) {
			System.out.println("true");
		}else {System.out.println("false");};
		
		System.out.println(name.endsWith("e"));
		
		System.out.println(name.indexOf("welcome"));
		
		String st="wel come";
		String strf=st.substring(st.indexOf(0,4));
		String strl=st.substring(st.indexOf(4));
		String expected= strl+" "+strf;
		System.out.println(expected);
		
		*/
		/*name.equals(null);
		name.equalsIgnoreCase(null);
		name.indexOf(0);
		name.isEmpty();
		name.lastIndexOf(0);
		name.length();
		//name.notify();
		//name.notifyAll();
		//name.replace(oldChar, newChar);
		//name.replace(target, replacement);
		//name.replaceAll(regex, replacement);
		//name.replaceFirst(regex, replacement);
		//name.split(regex);
		//name.startsWith(prefix);
		//name.substring(beginIndex);
		//name.substring(beginIndex, endIndex);
		name.toLowerCase();
		//name.toString();
		name.toUpperCase();
		name.trim();
		//name.charAt(index);
		*/
	}

}
