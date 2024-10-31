package Java_Basic.com;

public class IF_Else {
	
	
		 
	public static void main(int[] args) {
	
		
     int age=18;//vote 18-65 can vote only 
     if (age==17) {
    	 System.out.println("they can vote");
    	 
     }else if(age>65){
    	 System.out.println("they can't vote");
     }else if(age<65){
    	 System.out.println("can vote");
     }
     System.out.println("===========================================");
	int day=1;
	if(day==1) {
		System.out.println("monday");
	}
	else if(day==2) {
		System.out.println("tuesday");
		
	}
	
	else if(day==3) {
		System.out.println("wednesday");
		
	}
	else if(day==4) {
		System.out.println("thrusday");
		
	}
	else if(day==5) {
		System.out.println("friday");
		
	}
	else if(day==6) {
		System.out.println("saturday");
		
	}
	else if(day==7) {
		System.out.println("sunday");
		
	}else {
		System.out.println("out of week");
	}
	System.out.println("===============================================");
	//int day =1;
	 switch(day) 
	 {
	 case 1: System.out.println("monday");
	 break;
	 case 2: System.out.println("tuesday");
	 break;
	 case 3: System.out.println("wednesday");break;
	 case 4: System.out.println("thrusday");break;
	 case 5: System.out.println("friday");break;
	 case 6: System.out.println("saturday");break;
	 case 7: System.out.println("sunday");break;
	 default: System.out.println("out of week day");
	 }
	 
	 System.out.println("-----------&&---------------------");
	 
	 int age1=20;
	 if (age1!=30 || age!=40) {
		 System.out.println("can go to school");
		 
	 }else {
		 System.out.println("can not go to school");
	 }
	 int num=2;
	 if(num %2==0) {
		 System.out.println("even");
		 
	 }
	 

	}
}
