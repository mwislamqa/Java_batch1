package com.api_data_dynamic;

public class Demo {

	public static void main(String[] args) {
		String name = "Md islam 1";

		int uperCase = 0;
		int lowderCase=0;
		int number=0;
		int spcialCh=0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			//System.out.println(ch);
			if (ch>= 'A' && ch <= 'Z') {

				uperCase++;
				
			}
			else if (ch>= 'a' && ch <= 'z') {

				lowderCase++;
				
			}
			else if (ch>= '0' && ch <= '9') {

				number++;
				
			}
			else {

				spcialCh++;
				
			}
		}
		System.out.println(uperCase);
		System.out.println(lowderCase);
		System.out.println(number);
		System.out.println(spcialCh);
	}

}
