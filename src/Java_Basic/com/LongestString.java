package Java_Basic.com;

import java.util.HashMap;
import java.util.Map;

public class LongestString {
	
	
	public static void main(String[] args) {
		m("gggabbcdefkkttnnn");
 
	}

	public static void m(String name) {
		String longch = null;
		int longLength=0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();//LinkedHashMap maintain orders.
		char[] nameArray = name.toCharArray();
		
		for (int i = 0; i < nameArray.length; i++) {
			char ch = nameArray[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
	//	longch= map.keySet().toString();//if do not want to print index
		//	longLength=map.size();
			} 
		
			  else { 
				  i = map.get(ch); 
			       map.clear(); }
			 //if you want to print index
			
			  if (map.size()>longLength) { 
				  longLength=map.size(); 
				  longch=map.keySet().toString();
			  
			  }
			
		}
		System.out.println(longch);
		System.out.println(longLength);
/*		
		HashMap<Character,Integer> mp= new HashMap<Character,Integer>();
	char[] namechar=	name.toCharArray();
	for(int i=0; i<namechar.length;i++)
	{
		char namec=namechar[i];
		if (!mp.containsKey(namec));
		mp.put(namec, 1);
	}
*/
	}

}
