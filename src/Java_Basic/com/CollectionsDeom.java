package Java_Basic.com;

import java.util.ArrayList;

public class CollectionsDeom {

	public static void main(String[] args) {
		//length is fix
		String a[]= {"dd","ddk","dkldjl"};
		ArrayList<String> list= new ArrayList<String>();
		list.add("md");
		list.add("kd");
		list.add("pt");
		for(String s:list) {
			System.out.println(s);
			
		}
		System.out.println("========================");
		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(20);
		list1.add(23);
		list1.add(24);
	
		System.out.println("============================");
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(20);
		list2.add(23);
		list2.add(24);
		list2.remove(0);
		list2.addAll(list1);
		System.out.println(list2.get(0));
		for(int i:list2) {
			System.out.println(i);
			
		}
		System.out.println("============================");
		ArrayList<Object> list3= new ArrayList<Object>();
		list3.add(20);
		list3.add("md islam");
		list3.add(20.50);
		
		//ArrayList<Employee> emp= new ArrayList<Employee>();
		//emp.add(new Employee(1, "md"));
		
		
		
	}

}
