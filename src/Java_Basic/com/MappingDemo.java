package Java_Basic.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MappingDemo{

	
	public static void main(String[] args) {
		
		
		//insert data key value pair 
		/*
		 * HashMap<Integer,String> map= new HashMap<Integer, String>(); map.put(1,
		 * "md"); map.put(2, "Nazmul"); map.put(3, "Reyad"); map.put(4, "Arif");
		 */
		/*
		 * System.out.println(map.get(2)); for(Entry<Integer, String> emp:
		 * map.entrySet()) { System.out.println(emp.getKey());
		 * System.out.println(emp.getValue());
		 * 
		 * }
		 */
		HashMap<Integer,Employee> map1= new HashMap<Integer, Employee>();
		Employee emp1=new Employee(01, 4, 21);
		Employee emp2=new Employee(02, 8, 22);
		System.out.println(emp1);
		map1.put(1, emp1);
		map1.put(2, emp2);
		//Set<Map.Entry<Integer,Employee>> entrys=map1.entrySet();
		for(Entry<Integer, Employee> e: map1.entrySet()) {
			int index=e.getKey();
			Employee em=e.getValue();
			System.out.println(index);
			System.out.println(em);

		}
	}

}
