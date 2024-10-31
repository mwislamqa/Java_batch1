package Java_Basic.com;

import java.util.Arrays;

public class StringClasslearning {
	
	
	public static void main(String[] args) {
		

		String nul="ab_cd";
		String []dele=nul.split("-");
		System.out.println(Arrays.toString(dele));
		
	String name= "md islam";
	String name1= "MD ISLAM";
	System.out.println(name.concat(" "+name1));
	System.out.println("----------------------");
	String [] ss=name.split(" ");
	for(String s:ss) {
		System.out.println(s);
	}
	
	System.out.println("----------------------");	
	
	
	
	
	System.out.println(name.equals(name1));
	System.out.println("----------------------");
		for(int i=0; i<name.length();i++) {
			/*
			 * if(i%2==0) { System.out.println("eveen::::"+name.charAt(i)); }else {
			 * System.out.println("odd:::"+name.charAt(i)); }
			 */
			
			//System.out.println(name.charAt(i)+"*");
			System.out.println(name.charAt(0));
		}
		System.out.println("----------------------");
		System.out.println(name.charAt(0));

		System.out.println("----------------------");
	System.out.println(name.toUpperCase());
	

	}
	

}
