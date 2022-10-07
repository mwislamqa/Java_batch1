package Java_Basic.com;

public class ForEachLoop {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	//for each loop
		for(int i: a ) {
		
		if(i==3) {
			break;
			//continue;//skip
			
		}
		System.out.println(i);
		}
		//System.out.println(a[0]);
	}

}
