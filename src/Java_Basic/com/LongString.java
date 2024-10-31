package Java_Basic.com;

import java.util.HashMap;
import java.util.Map;

public class LongString {

	public static void main(String[] args) {

		String str = "gggabbcdefkkttnnn";
		char[] strChar = str.toCharArray();
		String lognst = null;
		int length = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < strChar.length; i++) {
			char cha = strChar[i];
			if (!map.containsKey(cha)) {
				map.put(cha, i);

			} else {
				i = map.get(cha);
				map.clear();
			}

			if (map.size() > length) {
				length = map.size();
				lognst = map.keySet().toString();

			}

		}
		System.out.println(lognst);
		System.out.println(length);

	}

}
