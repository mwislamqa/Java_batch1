package Java_Basic.com;

public class CountLetters {

	public static void main(String[] args) {
/*
		String str = "Welcome to UA 2011 ?";
		int Upper = 0;
		int Lower = 0;
		int space = 0;
		int special = 0;
		String []cc=str.split(" ");
		for (int i = 0; i < str.length(); i++) {
			char[] ch=str.toCharArray();
			char st = str.charAt(i);
			if (Character.isUpperCase(str.charAt(i))) {
				Upper++;
			}
			if (Character.isLowerCase(st)) {
				Lower++;
			}
			if (Character.isSpaceChar(st)) {
				space++;
			}
			/*
			 * if(str.contains("^A-Za-z0-9]")) { special++; }
			 */
		
			//differetn 
			/*if(ch[i]>='A' && ch[i]<='Z') {
				Upper++;
			}
			else if(ch[i]>='a' && ch[i]<='z') {
				Lower++;
			}
			else if(ch[i]>='0' && ch[i]<='9') {
				space++;
			}
			else
				special++;
			*/
		
		

			//System.out.println(str.charAt(i));
		/*}
		System.out.println("Upper Letter   :" + Upper);
		System.out.println("Lower Letter   :" + Lower);
		System.out.println("space Letter   :" + space);
		System.out.println("special Letter   :" + special);
		*/
		String str1= "abcd";
		String []split1 = str1.split("");
		for(String a: split1) {
			
			System.out.println(a);
		//	if (str1==a.concat(str)) {
				
			}
		}
	}


