package Java_Basic.com;

public class SubStringFind {

	public static void main(String[] args) {
		String str = "abc ght able abc";
		
		String substring ="abc";
		int count=str.indexOf(substring);
		int countIndex=0;
		  while(count!=-1) 
		  {  
			  System.out.println("Found at index: " + count);
			  countIndex++;
			count=  str.indexOf(substring,count +1 );
		   }
		 
		  System.out.println(countIndex);
	/*	
		String str = "abc ght able abc";
        String substring = "abc";
        int count = 0;
        int index = str.indexOf(substring);

        // To store all occurrences' indexes
        while (index != -1) {
            System.out.println("Found at index: " + index);
            count++;
            index = str.indexOf(substring, index + 1);
        }

        System.out.println("Total occurrences: " + count);
        
        */
        }

	}
