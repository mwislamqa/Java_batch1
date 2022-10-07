package Java_Basic.com;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer > list=  new ArrayList<Integer>();
		
		
		list.add(48);
		//list.remove(0);
		list.add(50);
		list.set(0, 100);
		
		System.out.println("index"+list.get(0));
		ArrayList<Integer > list1=  new ArrayList<Integer>();
		list1.add(40);
		list.addAll(list1);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
